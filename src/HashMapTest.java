//2022 10 12 P413
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>(); //변수의 타입을제한 -제네릭
		map.put("myid","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		
		//keySet() : 키값 전체를 반환한다.
		
		Set<String> keys = map.keySet();//③key값만가져오고싶을때
		Iterator<String> it =keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		//위랑결과값 같음, 더 심플하게 쓸수있다
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("=============");
		
		//values() : values 전체를 반환한다.④value값만가져오고싶을때
		Collection<String> values = map.values();
		Iterator<String>itV = values.iterator();

		while(itV.hasNext()){
			String value = itV.next();
			System.out.println(value);
		}
		//⑤둘다 불러올때 
		Set<Map.Entry<String, String>>entry = map.entrySet();
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent =itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]:"+ key +", [value]:" + value);
		}
		
		System.out.println("================");
		//위랑 결과값같은데 다른방법
		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:"+ key +", [value]:" + value);
		}
//		①
//		System.out.println(map);
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("아이디 입력 :");
//			String id = sc.next();
//			
//			System.out.println("비번 입력 :");
//			String password = sc.next();
//	
//			//get(key) -> value값 반환
//			//get("myid") -> "1234"
//			//containKey(key) -> 존재유무 확인(true,false)
//			
//			if(!map.containsKey(id)) {
//				System.out.println("아이디가 존재하지 않습니다. 다시입력");
//				continue; //반복문 지속
//			}else {
//				if(!(map.get(id)).equals(password)) {
//					System.out.println("비번 존재하지 않습니다. 다시입력");
//				}else {
//					System.out.println("로그인 성공");
//					break; //무한반복문종료
//				}
//			} 
//			②
//			map.remove("myid");
//			System.out.println(map);
//			
		}


	}


