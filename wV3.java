package test;

// Memory area
// Stack(Method,Construction) / Heap(new 연산자로 객체화된 Object)
// Memory -> Last Input First Out (LIFO)

class Sip {
	int x = 3;
	static int j = 10;
	
	void p1() {
		p2(x);
		int t = 4;
	}
	
	void p2(int argA) {
		int z = 5;
		p3(z,argA);
	}
	
	void p3(int argA, int argB) {
		System.out.println(argA + ":" + argB);
	}
	
	
}

public class wV3 {
	public static void main(String[] args) {
		
		int k =10;
		Sip f1 =new Sip();
		f1.p1();
		System.out.println(k);
		System.out.println(Sip.j);
	}
}
