package day20;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IPEX01 {

	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getByName("localhost");
			System.out.println(address);
			
			address = InetAddress.getByName("www.naver.com");
			System.out.println(address);
			
			
			InetAddress [] list = InetAddress.getAllByName("www.naver.com");
			System.out.println(Arrays.toString(list));
			
		} 
		catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
