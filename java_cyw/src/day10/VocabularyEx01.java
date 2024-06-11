package day10;

import java.util.Scanner;

public class VocabularyEx01 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 메뉴
		// 단어 등록
		// 단어 수정
		// 단어 검색
		// 단어 삭제
		// 종료
		// 메뉴 선택
		
		int menu;
		int WORD_MAX = 2;
		Word [] list = new Word[WORD_MAX];
		int wordCount = 0;
		
		do {
			
			printMenu();
			menu = scan.nextInt();
			// runMenu(menu);
			
			switch(menu) {
			
			case 1 : 
				
				System.out.println("단어 등록 기능 구현 중입니다. \n단어를 입력하세요");
				
				wordCount = insertWord(list, wordCount);
				
				break;
				
			case 2 :
				System.out.println("단어 수정 기능 구현 중입니다. \n단어를 입력하세요");
				changeWord(list, wordCount);
				break;
				
			case 3 :
				System.out.println("단어 검색 기능 구현 중입니다. \n단어를 입력하세요");
				
				break;
				
			case 4 :
				System.out.println("단어 삭제 기능 구현 중입니다. \n단어를 입력하세요");
				
				break;
				
			default :
				System.out.println("잘못된 메뉴입니다");
				
				}
		}
		while(menu != 5);
		
		System.out.println("프로그램을 종료합니다");
	}
	
	
	
	
	
	
	
	
	
	public static void printMenu() {
		
		System.out.println("메뉴");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 검색");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택 : ");
		
	}
	
	public static void runMenu(int menu) {
		
		switch(menu) {
		
		case 1 : 
			System.out.println("단어 등록 : ");
			return;
			
		case 2 :
			System.out.println("단어 수정 : ");
			return;
			
		case 3 :
			System.out.println("단어 검색 :");
			return;
			
		case 4 :
			System.out.println("단어 삭제 : ");
			return;
			
		case 5 :
			System.out.println("프로그램을 종료합니다");
			return;
			
		default :
			System.out.println("잘못된 메뉴입니다");
			
			}
		
	}
	
	public static int checkWord(Word[] list, int wordCount, Word word) {
		
		for(int i = 0; i < wordCount; i++) {
			
			if(list[i].getWordClass() != word.getWordClass()) {
				continue;
			}
			if(list[i].getWord() != word.getWord()) {
				continue;
			}
			if(list[i].getMeaning() != word.getMeaning()) {
				continue;
			}
			
			return i;
			
		}
		
		return -1;
		
	}
	
	public static Word inputWord() {
		
		System.out.print("품사 입력 : ");
		String wC = scan.next();
		
		System.out.print("단어 입력 : ");
		String w = scan.next();
		
		scan.nextLine();
		
		System.out.print("뜻 입력 : ");
		String m = scan.nextLine();
		
		Word word = new Word(wC, w, m);
		
		return word;
		
		}

	public static void wordSort(Word [] list, int wordCount) {
		
		for(int i = 0; i < wordCount - 1; i++) {
			for(int j = 0; j < wordCount - 1; j++) {
				if(list[j].getWord().compareTo(list[j+1].getWord()) > 0) {
					Word tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
		}
	}

	public static int insertWord(Word [] list, int wordCount) {
		
		Word word = inputWord();
				
		list[wordCount] = word;
		wordCount++;
		
		wordSort(list, wordCount);
		
		System.out.println("====================");
		System.out.println("단어 등록을 완료했습니다.");
		System.out.println("====================");
		
		if(wordCount == list.length) {
			list = expandWordList(list, list.length + 10);
			}
		
		return wordCount;
	}

	public static Word[] expandWordList(Word [] list, int size) {
		
		if(list.length >= size) {
			return list;
		}
		
		Word [] tmp = new Word[size];
		System.arraycopy(list, 0, tmp, 0, list.length);
		
		return tmp;
	}

	public static void changeWord(Word [] list, int wordCount) {
		
		System.out.println("단어 : ");
		String word = scan.next();
		int count = 0; // 일치하는 단어의 개수
		
		for(int i = 0; i < wordCount; i++) {
			if(list[i].getWord().equals(word)) {
				System.out.println(i + 1 + ".");
				list[i].print();
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("수정할 단어가 없습니다");
			return;
		}
		
		System.out.println("수정할 단어 번호 선택 : ");
		int num = scan.nextInt();
		boolean res = findWord(list, word, num-1);
		if(!res) {
			System.out.println("잘못된 번호입니다");
			return;
		}
		Word tmp = inputWord();
		
		list[num-1].updateWord(tmp);
		list[num-1].print();
		
		wordSort(list, wordCount);
		
		System.out.println("====================");
		System.out.println("단어 수정을 완료했습니다.");
		System.out.println("====================");
		
	}
	
	public static boolean findWord(Word [] list, String word, int index) {
		
		if(list.length <= index || index < 0) {
			return false;
		}
		
		if(list[index] == null) {
			return false;
		}
		
		return list[index].getWord().equals(word);
	}
	
	

}




class Word {
	
	// 단어, 뜻, 품사
	private String word, meaning, wordClass;
	
	// 생성자
	public Word(String wordClass, String word, String meaning) {
		this.wordClass = wordClass;
		this.word = word;
		this.meaning = meaning;
	}


	
	public void updateWord(Word word) {
		
		this.word = word.word;
		this.wordClass = word.wordClass;
		this.meaning = word.meaning;
		
	}


	// 필요한 기능
	
	public void print() {
		
		System.out.println("====================");
		System.out.print("품사 : " + wordClass);
		System.out.print("단어 : " + word);
		System.out.print("뜻 : " + meaning);
		System.out.println("====================");
		
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getWordClass() {
		return wordClass;
	}
	public void setWordClass(String wordClass) {
		this.wordClass = wordClass;
	}
	
}