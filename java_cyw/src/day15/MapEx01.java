package day15;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		
		// Map 기본 예제
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("admin", "admin123");
		// put(key, value)
		// key와 value를 추가, 이미 key가 등록된 상태면 새 value를 저장, 기존 value 반환
		
		System.out.println(map.put("admin", "admin12345"));
		
		System.out.println(map);
		
		map.remove("admin");
		// remove(key)
		// 주어진 key와 일치하는 key가 있으면 삭제하고 value를 반환
		
		System.out.println(map);
		
		map.put("abc123", "def123");
		map.put("asdasd", "def123");
		
		System.out.println(map);
		
		System.out.println(map.containsKey("admin"));
		System.out.println(map.containsKey("asdasd"));
		// containsKey(key)
		// 주어진 key와 일치하는 키가 있는지 없는지 반환
		

	}

}
