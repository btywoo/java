package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		
		// Map을 이용한 반복문 예제
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("2000160001", "고길동");
		map.put("2000160002", "홍길동");
		map.put("2024135001", "임꺽정");
		
		
		// 방법 1. keySet 이용. set으로 만든 후, set을 통해 반복문을 이용하여 실행
		
		Set<String> set = map.keySet();
		// map.keySet의 반환값이 set이기 때문에 형변환 또는 Set으로 통일해줘야 한다
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		// 방법 2. EntrySet을 이용. Entry 클래스를 이용해 set으로 만든 후, 반복문 활용
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();
		
		while(it2.hasNext()) {
			Map.Entry<String, String> tmp = it2.next();
			String key = tmp.getKey();
			String value = tmp.getValue();
			System.out.println(key + " : " + value);
		}
		
		
		
		

	}

}
