package day19.post;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Post implements Serializable{
	
	private static final long serialVersionUID = 1639237142571349995L;
	
	private String title;		// 제목
	private String contents;	// 내용
	private String ID;			// ID
	private String PW;			// 비밀번호
	private int view; 			// 조회수
	
	private int num;			// 게시글 번호
	
	
	private static int count = 0; // 게시글 번호를 생성할 때 활용


	public Post(String title, String contents, String iD, String pW) {
	// 이 생성자를 이용할 때만 게시글 번호를 1 증가하도록 함
		this.title = title;
		this.contents = contents;
		ID = iD;
		PW = pW;
		this.num = ++count;
	}
	
	
	public Post(int num) {
		super();
		this.num = num;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return num == other.num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public String toString() {
		return num + ". " + title + " : " + ID + " / " + view;
	}
	

	public void update(String title, String contents) { 
	// 제목과 내용을 수정하는 메소드
		this.title = title;
		this.contents = contents;
	}
	
	
	public void print() {
		System.out.println("제목 : " + title);
		System.out.println("작성자 : " + ID);
		System.out.println("내용 : " + contents);
		System.out.println("조회수 : " + ++view);
	}

	
	public boolean chechWriter(String id, String pw) {
		return this.ID.equals(id) && this.PW.equals(pw);
	}


	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Post.count = count;
	}


}
