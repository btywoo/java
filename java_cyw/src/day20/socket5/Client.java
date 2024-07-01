package day20.socket5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {
	
	private String id;
	private Socket socket;
	public static final String EXIT = "-1";
	
	public void recive() {
		
		Thread t = new Thread(()-> {
			
			try {
				ObjectInputStream ois = 
						new ObjectInputStream(socket.getInputStream());
				
				while(true) {
					String id = ois.readUTF();
					String chat = ois.readUTF();
					if(chat.equals(EXIT)) {
						break;
					}
					System.out.println(id + " : " + chat);
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		t.start();
	}
	
	public void send() {
		
		Thread t = new Thread(()-> {
			
			try {
				ObjectOutputStream oos = 
						new ObjectOutputStream(socket.getOutputStream());
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				
				while(true) {
					System.out.println("전송할 내용을 입력하세요");
					String str = scan.nextLine();
					
					oos.writeUTF(id);
					oos.writeUTF(str);
					oos.flush();
					
					if(str.equals(EXIT)) {
						break;
					}
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		t.start();
	}
}
