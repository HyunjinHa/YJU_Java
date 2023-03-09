package test;
import java.util.*;
	// 파일 풀네임으로 사용가능 패키지이름 + 클래스이름
	// test.test_OOP
	// 클래스 기능별로 패키지에 나누어 담아서 사용시 편리
	// 다른 패키지에 넣을 시 같은 이름의 클래스 존재 가능
class Foo {
	// 1) 멤버 변수
	int k;
	
	// 2) 멤버 메서드
	// 3) 생성자
	// 객체 생성 후 바로 실행 (1번만)
	Foo() {
		k = 2;
	}
}
	// .java 파일 실행 시
	// 클래스 별로 나누어짐
	// main 클래스 포함 3개로 나뉨 (Foo, Bar, test_OOP)

// Memory Leak (C++에서 자주 발생하는 문제)

// Garbage Collector (GC)
// 위 문제점을 해결하기 위해서 자바에서는 GC사용

class Car {
	// Overloading
	// 적용 대상 : 메서드/생성자
	// 매개변수의 자료형과 갯수로만 구분가능
	void prt() {System.out.println("hello");}
	void prt(int a) {System.out.println("hello" + a);}
	void prt(double a) {System.out.println("hello" + a);}
	void prt(char a) {System.out.println("hello" + a);}
	void prt(int a, int b) {System.out.println("hello" + a + "-" + b);}
}

class Far {
	final int f;
	
	Far() {
		f = 5;
	}
	
	void cul(int a) {System.out.println(a * f);}
}
public class test_OOP {

	public static void main(String[] args) {
		//import 없이 사용가능
		// java.util.Scanner sc;
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		
		Far f1 = new Far();
		
		f1.cul(j);

	}

}
