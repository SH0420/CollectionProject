//2022 10 11 P390
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //Object 형변환
//		list.add("1");
//		list.add("1");//중복허용 //참조형 주소값받음
//		list.add(new Integer(1));
//		list.add(1);
//		list.add("2");
//		list.add(2);
		
//		list.add("1"); //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
////		String str = (String)list.get(0);  // Object -> String
////		System.out.println(str);
//		
//		int sum = 0;
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(3);
//		
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
//		Stack st = new Stack();
//		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//
//		try {
//			
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());  //peek
//		}catch(EmptyStackException e) {
//			System.out.println("Stack이 비어있습니다.");
//		}

		
//		while(!st.empty()) {
//			System.out.println((String)st.pop());
//		}
		
//		ArrayList list = new ArrayList();
		
//		list.add("1"); //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//iterator (반복자 패턴)
		
//		Iterator it= list.iterator();
//		
//		while(it.hasNext()) { //데이터 존재 유무 확인
//			String str = (String)it.next(); //값을 가지고 오는 역할
//			System.out.println(str);
//		}
	
		//제네릭 " 컬렉션 객체의 데이터 타입을 한정 한다.
		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("1");
//
//		list.add("1"); //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//
//		Iterator<String> it =list.iterator();
//		
//		while(it.hasNext()) { 
//		    String str = (String)it.next(); 
//		    System.out.println(str);
//		}
		
		//Set 순서도없지만 중복도 허용하지않음
		
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));
//		
//		System.out.println(set);
		
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String str =(String)it.next();
//			System.out.println(str);
//		}
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int[5][5];
//		
//		for(int i=0; set.size()<25;i++) {
//			set.add((int)(Math.random()* 50) + 1);
//		}
//		
////		System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list);
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo.length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo.length;j++) {
//				System.out.print(bingo[i][j] +" ");
//			}
//			System.out.println();
//		}
//		
		//TteeSet : 반드시 값으로 사용되는 해당 클래스안에는 정렬 조건이 오버라이딩 되어있어야한다.
		//implements Comparable (Integer,String.....)
		
//		TreeSet <Integer> set= new TreeSet<Integer>(); //값이 정렬되어진다.
//		set.add(new Integer(2));
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg =it.next();
//			System.out.println(intg);
//			
//		}
		
		
		TreeSet <Student> set= new TreeSet<Student>();
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("him",3,1,10,10,10);
		Student s3 = new Student("sim",5,1,10,10,10);
		Student s4 = new Student("dim",4,1,10,10,10);
		Student s5 = new Student("yim",9,1,10,10,10);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator <Student> it= set.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
		
	}
	

}
