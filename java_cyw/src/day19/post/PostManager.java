package day19.post;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import program.Program;

public class PostManager implements Program{
	
	private List<Post> list = new ArrayList<Post>();
	private Scanner scan = new Scanner(System.in);
	
	private final int INSERT = 1;
	private final int UPDATE = 2;
	private final int DELETE = 3;
	private final int SEARCH = 4;
	private final int EXIT = 5;

	@Override
	public void printMenu() {
		
		System.out.println("=========================");
		System.out.print("메뉴\r\n"
				+ "1. 게시글 등록\r\n"
				+ "2. 게시글 수정\r\n"
				+ "3. 게시글 삭제\r\n"
				+ "4. 게시글 검색\r\n"
				+ "5. 프로그램 종료\r\n"
				+ "메뉴 선택 : ");
		
	}

	@Override
	public void runMenu(int menu) throws Exception {
		
		switch(menu) {
		case INSERT:
			insert();
			break;
		case UPDATE:
			update();
			break;
		case DELETE:
			delete();
			break;
		case SEARCH:
			search();
			break;
		case EXIT:
			exit();
			break;
		default:
			System.out.println("=========================");
			System.out.println("잘못된 메뉴입니다. 올바른 메뉴를 선택하세요.");
		}
		
	}


	@Override
	public void run() {
		
		String fileName = "src/day19/post/post.txt";
		
		load(fileName);
		
		int menu = INSERT;
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}
			catch(Exception e) {
				System.out.println("예외가 발생했습니다");
				e.printStackTrace();
			}
		}while(menu != EXIT);
		
		save(fileName);
		
	}
	
	
	private void insert() {
		
		System.out.println("=========================");
		System.out.print("제목 : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("ID : ");
		String ID = scan.next();
		System.out.print("비밀번호 : ");
		String PW = scan.next();
		
		
		Post p = new Post(title, contents, ID, PW);
		list.add(p);
		
		System.out.println("=========================");
		System.out.println(p.getNum() + "번 게시글이 추가 되었습니다");
		
	}
	
	private void update() {
		
		System.out.println("=========================");
		System.out.print("수정할 게시글 번호를 입력하세요 : ");
		int num = scan.nextInt();
		
		Post post = selectPost(num);
		
		if(post == null) {
			return;
		}
		
		System.out.println("=========================");
		scan.nextLine();
		System.out.println("수정하실 제목을 입력해주세요 : ");
		String newTitle = scan.nextLine();
		System.out.println("수정하실 내용을 입력해주세요 : ");
		String newContents = scan.nextLine();
		
		post.update(newTitle, newContents);
		
		System.out.println("=========================");
		System.out.println(post.getNum() + "번 게시글이 수정되었습니다");
		
	}
	
	private void delete() {
		
		System.out.println("=========================");
		System.out.print("삭제할 게시글 번호를 입력하세요 : ");
		int num = scan.nextInt();
		
		Post post = selectPost(num);
		
		if(post == null) {
			return;
		}
		
		if(list.remove(post)) {
			System.out.println("=========================");
			System.out.println(post.getNum() + "번 게시글이 삭제되었습니다");
		}
		
		
	}
	
	private void search() {
		
		System.out.println("=========================");
		System.out.print("검색(전체 목록을 보시려면 엔터를 눌러주세요) : ");
		System.out.println("=========================");
		scan.nextLine();
		String search = scan.nextLine();
		
		List<Post> searchList = getSearchList(search);
		
		if(searchList.size() == 0) {
			System.out.println("일치하는 게시물이 없습니다.");
			return;
		}
		
		printList(searchList);
		
		System.out.println("=========================");
		System.out.print("게시글을 확인하시겠습니까? (Y / N) : ");
		String answear = scan.nextLine();
		
		if(!answear.equals("Y") || !answear.equals("y")) {
			return;
		}
		
		System.out.println("=========================");
		System.out.print("검색 결과 중 확인할 게시글의 번호를 선택하세요 : ");
		int num = scan.nextInt();
		Post post = new Post(num);
		
		int index = searchList.indexOf(post);
		
		if(index < 0) {
			System.out.println("=========================");
			System.out.println("검색 결과에는 없는 게시물입니다");
			return;
		}
		
		post = searchList.get(index);
		
		post.print();
		
		System.out.println("=========================");
		System.out.println("메뉴로 가시려면 엔터를 입력하세요");
		scan.nextLine();
		scan.nextLine();
		
	}
	

	private void exit() {
		System.out.println("=========================");
		System.out.println("프로그램을 종료합니다");
		System.out.println("=========================");
	}
	
	
	public Post selectPost(int num) {
		
		Post post = new Post(num);
		
		int index = list.indexOf(post);
		
		if(index < 0) {
			System.out.println("=========================");
			System.out.println("등록되지 않거나 삭제된 게시글입니다");
			return null;
		}
		
		System.out.println("=========================");
		System.out.println("ID를 입력해주세요 : ");
		String ID = scan.next();
		System.out.println("비밃번호를 입력해주세요 : ");
		String PW = scan.next();
		
		post = list.get(index);
		
		if(!post.chechWriter(ID, PW)) {
			
			System.out.println("=========================");
			System.out.println("ID 또는 비밀번호가 다릅니다");
			return null;
		}
		
		return post;
	}
	
	private List<Post> getSearchList(String search) {
		
		return list.stream().filter(p->p.getTitle().contains(search) 
								 || p.getContents().contains(search))
							.collect(Collectors.toList());
	}
	
	private void printList(List<Post> searchList) {
		for(Post post : searchList) {
			System.out.println(post);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
		
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			int count = ois.read();
			Post.setCount(count);
			list = (List<Post>)ois.readObject();
		} 
		catch (Exception e) {
			System.out.println("불러오기에 실패했습니다.");
		} 
		
	}
	
	@Override
	public void save(String fileName) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.write(Post.getCount());
			oos.writeObject(list);
		} 
		catch (Exception e) {
			System.out.println("저장에 실패했습니다.");
		}
		
	}
	
}
