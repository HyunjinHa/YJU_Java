package test;

// 상속의 종류 -> 다중상속 / 단일상속
// 자바에서는 단일상속만 사용
// C++은 다중상속도 존재

// 다형성 == 다양한 형태의 성질을 가지는 것
// 다형성 -> 참조변수가 사용
// 부모의 참조변수형으로 자식의 객체를 가르킬 수 있다


class  Terran {
	
}

class Scv extends Terran {
	
}

class Marine extends Terran {
	
	Terran getObj() {
		return new Marine();
	}
}

class Tank extends Terran {
	
}


public class wV7 {

	public static void main(String[] args) {
		
		Scv scvList[] = new Scv[200];
		Marine marineList[] = new Marine[200];
		Tank tankList[] = new Tank[200];
		
		tankList[0] = new Tank();
		marineList[0] = new Marine();
		scvList[0] = new Scv();
		
		Terran unitList[] = new Terran();
	}

}
