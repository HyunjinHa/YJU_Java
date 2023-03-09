package test;

// 변수
// 1) 멤버 변수 : 클래스 내에 선언된 변수 (생성자/메서드 내 제외)
// - 클래스 멤버 변수
// - 인스턴스 멤버 변수
// 2) 지역 변수 : 생성자/메서드 내에 선언된 변수
// 3) 매개 변수 : 생성자/메서드 호출 시 인자 값을 저장하기 위한 변수

// 접근범위(), 생명주기() - 변수가 메모리 상에 저장되고 소멸되기 까지

// 멤버 변수 : 클래스 내에서 사용
//				객체 생성 시 / 객체 소멸시||프로그램 종료 시
// 지역 변수 : 생성자||메서드 내에서  사용
//				생성자||메서드 호출 후 선언 시 / 포함된 {} 종료 시
// 매개 변수 : 생성자||메서드 내에서  사용
//				생성자||메서드 호출 시 / 생성자||메서드 종료 시

class Too {
	char a; //
	Too(char argA) {
		int i = 3;
		a = 'a';
	}
	
	void cul(int argValue) {
		int temp = 2;
	}
}

class Fou {
	int k = 10;
	Baa b1;
	
	Fou() {
		b1 = new Baa(k);
	}
}

class Baa {
	int x;
	
	Baa(int argA) { x = argA; bp1(argA);}
	
	void bp1(int argA) {
		System.out.println(argA);
	}
}
public class wV2 {

	public static void main(String[] args) {
		Fou f1 = new Fou();
		Fou f2 = f1;
		f2.k = 20;
		System.out.println(f1.k);

	}

}
