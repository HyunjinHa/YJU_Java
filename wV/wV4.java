package test;

// 초기화 블록이란 무엇인가
// 인스터스와 클래스 초기화 블록의 차이점
// 초기화 블록을 사용하는 이유

class Koo {
	{   // 초기화 블럭
		// 생성자보다 먼저 호출됨
		// 모든 생성자에 사용되지 않거나
		// 가장 앞에 오지 않을 경우 사용 불가
		System.out.println("생성자 호출");
	}
	// Modification
	Koo() {
		//System.out.println("생성자 호출");
	}
	Koo(int argA) {
		//System.out.println("생성자 호출");
		System.out.println("생성자 호출" + argA);
	}
	Koo(int argA, int argB) {
		this(argA); // 위에 있는 생성자를 호출
		//System.out.println("생성자 호출");
		System.out.println("생성자 호출" + argA + ":" + argB);
	}
	Koo(int argA, float argB) {
		this(argA);
		System.out.println("생성자 호출" + argA + ":" + argB);
	}
}

public class wV4 {

	public static void main(String[] args) {
		

	}

}
