package test;

public class StringTest {

	public static void main(String[] args) {
		JavaTest t1 = new JavaTest();
	      t1.setName("Kang1Nam");
	      
	      String s1 = "동해물과 백백백";
	      char c = s1.charAt(5);
	      System.out.println(c);
	      
	      String s2 = "동해물과 백백백";
	      boolean r = s1 == s2;
	      // 주소값을 참조하기 때문에 false일 것 같지만 true
	      // 리터럴이 같으면 하나만 생성
	      System.out.println(r);
	      
	      String s3 = new String("동해물과 백백백");
	      r = s1 == s3;
	      System.out.println(r);
	      
	      r = s3.equals(s1);
	      System.out.println(r);
	      
	      s1 = new String("I lov you so much");
	      s2 = new String("I Lov you so much");
	      
	      r = s1.equals(s2);
	      System.out.println(r);
	      
	      r = s1.equalsIgnoreCase(s2);
	      System.out.println(r);
	     
	      // String 객체는 immutable입니다.
	      // >>> String 객체는 변경할 수 없다.


	}

}
