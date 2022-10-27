//2022 10 12
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		
		//properties : k ->String, v -> String
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
////		String value = prop.getProperty("myid");
////		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			String value = prop.getProperty(element);
//			System.out.println(value);
//		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("src/input.txt")); //txt위치 찾아서 입력
		}catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); // 프로그램 강제종료
		}
		
		String name = prop.getProperty("name"); // Hong kil Dong
		String[] data= prop.getProperty("data").split(",");
		
		int max = 0;
		int min = 0;
		int sum = 0;

//		이름
//		max
//		min
//		sum
//		평균
		
		//문자열 -> 숫자 : Integer.parseInt(문자열)
		//숫자 -> 문자열 : String.valueOf(숫자)
		
		//방법①
//		for(int i =0;i<data.length;i++) {
//			int value = Integer.parseInt(data[i]); 
//			
//			if(max < value) { 
//				max = value;
//			}
//			
//			if(min > value) {
//				min = value;
//			}
//			
//			sum += value;
//		}
//		min = max;
//		
//		for(int i =0;i<data.length;i++) {
//			int value = Integer.parseInt(data[i]); 
//			
//			if(min > value) {
//				min = value;
//			}
//		}  
		//방법②
		for(int i =0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);
			if(i==0) {
				max =min =value;
			}
			if(max< value) {
				max=value;
			}else if(min>value) {
				min = value;
			}
			sum += value;
			
		}
			
					
		double avg = (double)sum / data.length;
		
		System.out.println("이름 :"+ name);
		System.out.println("최대 :"+ max);
		System.out.println("최소 :"+ min);
		System.out.println("합계 :"+ sum);
		System.out.println("평균 :"+ avg);

	
	}

}