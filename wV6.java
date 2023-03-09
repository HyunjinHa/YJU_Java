package test;

class AAA {
	int x = 2; int y = 5; int a = 8;
}

class BBB extends AAA {
	int x = 3; int z = 7;
	void prtY() {System.out.println(y);}
}

class CCC extends BBB {
	int x = 4; int y = 6;
	void prtA() {System.out.println(a);}
}

public class wV6 {

	public static void main(String[] args) {
		CCC c = new CCC();
		System.out.println(c.y);	// 6
		System.out.println(c.x);	// 4
		c.prtA();					// 8
		c.prtY();					// 5
	}

}
