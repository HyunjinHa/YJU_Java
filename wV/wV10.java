package test;

// Exception class -> object
// throw / throws
// try -> catch(Exception Handling) -> finally	// 예외 발생시
// try -> finally 			// 예외 미발생시

import java.util.Scanner;

public class wV10 {

	public static void main(String[] args) {
		
		int base;
		int height;
		float area;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("밑변 입력");
			base = sc.nextInt();
			
			if (base <= 0) 
				System.out.println("양의 정수를 입력하세요");
			else
				break;
		}
		
		while(true) {
			System.out.println("높이 입력");
			height = sc.nextInt();
			
			if (height <= 0)
				System.out.println("양의 정수를 입력하세요");
			else
				break;
		}
		
		// 면적 출력
		area = base * height / 2;
		System.out.println(area);
		
	}

}
