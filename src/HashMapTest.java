//2022 10 12 P413
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>(); //������ Ÿ�������� -���׸�
		map.put("myid","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		
		//keySet() : Ű�� ��ü�� ��ȯ�Ѵ�.
		
		Set<String> keys = map.keySet();//��key�����������������
		Iterator<String> it =keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		//��������� ����, �� �����ϰ� �����ִ�
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("=============");
		
		//values() : values ��ü�� ��ȯ�Ѵ�.��value�����������������
		Collection<String> values = map.values();
		Iterator<String>itV = values.iterator();

		while(itV.hasNext()){
			String value = itV.next();
			System.out.println(value);
		}
		//��Ѵ� �ҷ��ö� 
		Set<Map.Entry<String, String>>entry = map.entrySet();
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent =itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]:"+ key +", [value]:" + value);
		}
		
		System.out.println("================");
		//���� ����������� �ٸ����
		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:"+ key +", [value]:" + value);
		}
//		��
//		System.out.println(map);
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("���̵� �Է� :");
//			String id = sc.next();
//			
//			System.out.println("��� �Է� :");
//			String password = sc.next();
//	
//			//get(key) -> value�� ��ȯ
//			//get("myid") -> "1234"
//			//containKey(key) -> �������� Ȯ��(true,false)
//			
//			if(!map.containsKey(id)) {
//				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ��Է�");
//				continue; //�ݺ��� ����
//			}else {
//				if(!(map.get(id)).equals(password)) {
//					System.out.println("��� �������� �ʽ��ϴ�. �ٽ��Է�");
//				}else {
//					System.out.println("�α��� ����");
//					break; //���ѹݺ�������
//				}
//			} 
//			��
//			map.remove("myid");
//			System.out.println(map);
//			
		}


	}


