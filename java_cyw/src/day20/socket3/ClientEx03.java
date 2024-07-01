package day20.socket3;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx03 {

	public static void main(String[] args) {
		
		int port = 5001;
		String ip = "192.168.30.200";
		
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket(ip, port);
			System.out.println("[연결 성공]");
			
			Thread sendThread = new Thread(() -> {
			// 서버로 콘솔에서 입력한 내용을 전송하는 코드
				try {
					
					OutputStream os = socket.getOutputStream();
					ObjectOutputStream oos = new ObjectOutputStream(os);
					
					@SuppressWarnings("resource")
					Scanner scan = new Scanner(System.in);
					
					while(true) {
						
						System.out.println("전송할 채팅을 입력하세요 : ");
						String str = scan.nextLine();
						oos.writeUTF(str);
						oos.flush();
						
						if(str.equals("-1")) {
							break;
						}
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("[클라이언트 전송 기능 종료]");
				
			});
			
			sendThread.start();
			
			Thread receiveThread = new Thread(() -> {
				
				try {
					InputStream is = socket.getInputStream();
					ObjectInputStream ois = new ObjectInputStream(is);
					
					while(true) {
						String chat = ois.readUTF();
						
						if(chat.equals("-1")) {
							System.out.println("서버가 전송을 중단했습니다");
							break;
						}
						System.out.println("내용 : " + chat);
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			receiveThread.start();
		} 
		catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
