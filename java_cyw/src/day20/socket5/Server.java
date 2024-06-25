package day20.socket5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Server {
	
	private List<ObjectOutputStream> list = new ArrayList<ObjectOutputStream>();
	private Socket socket;
	
	public void receive() {
		
		Thread t = new Thread(()-> {
			
			String id = "";
		
			try {
				ObjectInputStream ois = 
						new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				list.add(oos);
				
				while(true) {
					
					id = ois.readUTF();
					String chat = ois.readUTF();
					System.out.println(id + " : " + chat);
					
					for(ObjectOutputStream tmp : list) {
						if(tmp != oos) {
						// 메시지를 보낸 소켓을 제외한 다른 소켓에 메시지를 전송	
							send(tmp, id, chat);
						}
					}
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
				System.out.println("[" + id + "님이 나갔습니다]");
			}
			catch(Exception e) {
				System.out.println("[예외 발생]");
			}
			
		});
		
		t.start();
		
	}
	
	public void send(ObjectOutputStream oos, String id, String message) {
		
		if(oos == null) {
			return;
		}
			
			try {
				synchronized (oos) {
					oos.writeUTF(message);
					oos.flush();
				}
			} 
			catch (IOException e) {
				list.remove(oos);
			}
		
	}
	
}
