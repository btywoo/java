package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		
		int port = 3000;
		
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
				System.out.println("[연결 성공]");
				}
			} 
		catch (IOException e) {
			e.printStackTrace();
			}
		
	}
	
}
