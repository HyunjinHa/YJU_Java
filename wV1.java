package test;
import java.util.*;

class Bar {
	String name;
	int id;
	
	// Overloading (자바 사용 가능)
	// 같은 이름을 가진 메소드나 생성자를 매개변수의 자료형에 따라서
	// 다른 결과값을 낼 수 있도록 하는 방법
	
	// Construction(생성자) <-> Destruction(소멸자)
	// 자바에서는 GC가 객체 소멸 관리 -> 자바는 소멸자 사용 불가능
	
	Bar() {
		// 어떤 종류이던 간에 생성자가 하나라도 있으면
		// 자바 컴파일러에서 자동으로 디폴트 생성자를 만들지 않음
		// 이 경우 디폴트 생성자 사용시 오류
	}
	
	Bar(String argName, int argId) {
		name = argName;
		id = argId;
		System.out.println(name + "&" + id);
	}
	
	void prt(String a, int b) {
		System.out.println(a + "&" + b);
	}
}

public class wV1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputName = sc.next();
		
		int inputId = sc.nextInt();
		
		Bar b1 = new Bar();
		
		b1.prt(inputName, inputId);

	}

}
