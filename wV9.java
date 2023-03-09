package test;

// 상속
// 	Modifier
// 		1) Access Modifier
//			a) 외부 접근 (참조 변수)
//			b) 상속
//		2) 그 외

class WV9A {
	int velocity;
	
	void incVelocity() {velocity++;}
	void decVelocity() {velocity--;}
	void prtVelocity() {System.out.println(velocity);}
}

public class wV9 {

	public static void main(String[] args) {
		// Public Protected  Default Private
		WV9A obj = new WV9A();
		
		obj.incVelocity();	// +1
		obj.incVelocity();	// +1
		
		obj.decVelocity();	// -1
		obj.prtVelocity();	// prt
		
		obj.velocity = 2000;
		obj.prtVelocity();
		
	}
}
