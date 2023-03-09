package test;
import java.util.*;

class Student {
	// 학생 성적 입력
	int id;			//학번
	String name;	//이름
	int scoreKor;	//국어점수
	int scoreMath;	//수학점수
	int scoreEng;	//영어점수
	int sum;		//점수합계
	float avg;		//점수평균
	
	Student(int argId, String argName) {
		id = argId;
		name = argName;
	}
	
	void setScore(int argKor, int argEng, int argMath) {	//과목별 점수 저장
		scoreKor = argKor;
		scoreEng = argEng;
		scoreMath = argMath;
	}
	
	void getSum() {	sum = scoreKor + scoreEng + scoreMath;}	//점수합계
	
	void getAvg() { avg = sum / 3.0f;}						//평균점수
}

class StdManager{
	final int NUM_OF_STD;	//리스트에 들어갈 수 있는 최대 학생 수
	Student stdList[];		//주소값을 가진 참조변수를 배열에 저장 (학생별로 data가 담기도록 설계)
	boolean play;			//반복문 실행값
	float totalSum;			//전체 학생의 평균점수합계
	float totalAvg;			//전체 학생의 평균점수
	Scanner sc;				//스캐너
	int count;	//입력데이터 갯수 카운트
	
	StdManager() {
		NUM_OF_STD = 10;	//최대 10명
		stdList = new Student[NUM_OF_STD];
		play = true;		//play가 true값일때 반복문 반복실행
		sc = new Scanner(System.in);
	}
	
	void getTotalAvg() {	//전체 평균 점수
		totalAvg = totalSum / count;
	}
	
	void prtMenu() {		//메뉴 출력
		System.out.println("=============================");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 목록 출력 (입력순)");
		System.out.println("3. 프로그램 종료");
		System.out.println();
		System.out.println("현 입력데이터 갯수 : " + count);
		getTotalAvg();		//출력 전 전체 평균 점수 계산
		System.out.println("전체 학생 평균 값 : " + totalAvg);
		System.out.println("=============================");
	}
	
	void inputStdData() {	//학생 data 입력 및 저장
		System.out.println("학번을 입력하세요.");
		int iId = sc.nextInt();
		System.out.println("이름을 입력하세요.");
		String iName = sc.next();
		Student std = new Student(iId, iName);
		count++; 			//학번,이름 입력과 동시에 카운트 증가
		
		System.out.println("국어 성적을 입력하세요.");
		int iKor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		int iEng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int iMath = sc.nextInt();
		std.setScore(iKor, iEng, iMath);
		
		std.getSum();		// 입력받은 점수들로 합계 계산
		std.getAvg();
		totalSum += std.avg;// 계산된 평균점수를 전체합계점수에 합함	
		stdList[count - 1] = std;	// count-1을 인덱스로 참조 변수를 배열에 저장
	}
	
	void prtStdData() {		//	배열에 저장된 학생 data 출력
		for (int i = 0; i < count; i++) {
			System.out.println("[ id : " + stdList[i].id + " name : " + stdList[i].name + " kor : "
								+ stdList[i].scoreKor + " eng : " + stdList[i].scoreEng + " math : "
								+ stdList[i].scoreMath + " sum : " + stdList[i].sum + " avg : " + stdList[i].avg);
		}
	}
	
	void selectMenu() {		//메뉴 선택
		int inputNum = sc.nextInt();// 메뉴에서 유저가 선택하여 입력하는 값
		
		if (inputNum == 1) {
			inputStdData();			// 학생 data 입력 메소드
		}
		
		else if (inputNum == 2) {	// 학생 data 출력 메소드
			prtStdData();
		}
		
		else if (inputNum == 3)
			play = false;			// play boolean값을 false로 바꿔서 반복문 탈출(정지)
	}
	//void selectMenu() {
	//	int inputNum = sc.nextInt();
	//	switch(inputNum) {
	//		case 1:
	//			inputStdData();
	//			
	//		case 2:
	//			prtStdData();
	//		
	// 		case 3:
	//			play = false;
	//
	//		default :
	//			System.out.println("재입력")
	
	void run() {					// 반복문
		while(play) {
			prtMenu();
			selectMenu();
		}
	}
}

public class sDb_OOP {

	public static void main(String[] args) {
		new StdManager().run();		//StdManager 클래스의 run()메소드 실행 -> 반복문 실행

	}

}
