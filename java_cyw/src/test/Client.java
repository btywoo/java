package test;

import java.io.IOException;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) {
		client();
	}
		
	@SuppressWarnings("unused")
	public static void client() {

	int port = 3000;
	String serverIP;
	
	try {
		serverIP = "192.168.100.77";
		@SuppressWarnings("resource")
		Socket socket = new Socket(serverIP, port);
		System.out.println("[연결 성공]");
		} 
	catch (IOException e) {
		e.printStackTrace();
		}

	}

}
