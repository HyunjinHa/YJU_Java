package test;

class X {
	int x = 3;
	int y = 10;
	void prtX() {
		System.out.println(x);
	}
}

class Y extends X {
	int x = 5;
	}
	
//	void prtX() {
//		System.out.println(x);
//	}

public class wV5 {

	public static void main(String[] args) {
		Y y = new Y();
		System.out.println(y.y); 	// 10
		System.out.println(y.x); 	// 5
		y.prtX();   				// 3	
		
		//A a = new B();
		//System.out.println(a.x);
	}

}
