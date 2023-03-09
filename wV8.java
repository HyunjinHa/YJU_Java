package test;

// 상속

class WV8A { // extends Object
//	static {System.out.println("S Initialization of A");}	// 클래스 초기화 블럭
//	{System.out.println("Initialization of A");}			// 초기화 블럭
//	A() {System.out.println("Constructor of A");}			// 생성자 블럭
	WV8A() {
		//super();				// 상위클래스의 생성자 호출
								// 부모 클래스가 존재 할 경우 super() 가 없으면
								// 자동으로 생성
		System.out.println("Constructor of A");
	}
}

class WV8B extends WV8A {
	WV8B() {
		//super();
		System.out.println("Constructor of B");
	}
	
	WV8B(int argX) {
		System.out.println("Constructor of B2");
	}
}

class WV8C extends WV8B {
	static int x;
	WV8C() {
//		super();	//-> B()			->	B
		super(x);	//-> B(int argX)	->	B2
		System.out.println("Constructor of C");
	}
}

public class wV8 {
	
	public static void main(String[] args) {
		
		new WV8C();
		//System.out.println(C.x);
	}
}
