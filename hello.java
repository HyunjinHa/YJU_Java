package test;
import java.util.*;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		//배열 개수 받기
		System.out.println("양의 정수를 입력하세요");
		int inputNum = scn.nextInt();
		
		while(inputNum > 100 || inputNum < 1) {
				System.out.println("다시 입력하세요");
				inputNum = scn.nextInt();
		}
		
		// 배열 선언
		int ranArr[] = new int[inputNum];
		
		// 난수값
		for(int i = 0; i < ranArr.length; i++) {
			int randNum =(int)((Math.random()*101)-50);
			
			// 중복제거
			for(int j = 0; j < i; j++) {
				if(randNum == ranArr[j]) {
					randNum =(int)((Math.random()*101)-50);
					j = -1;
				}
			}
			ranArr[i] = randNum;
		}
		
		Arrays.sort(ranArr);
		System.out.println(Arrays.toString(ranArr));
		
	}
}
