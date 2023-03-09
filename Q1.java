package test;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 양의 정수 n을 입력받고, n개의 정수형 배열 선언
		System.out.println("배열의 개수를 입력하세요.");
		
		int n = sc.nextInt();
		// n의 값은 1~100/ 아닐 경우 재입력
		while ( n < 1 || n > 100 ) {
			System.out.println("1 이상의 값을 입력하세요.");
			n = sc.nextInt();
		}
		
		int array[] = new int[n];
		// 난수를 발생하여 배열에 저장
		
		for (int i = 0; i < n; i++) {
			array[i] = (int)((Math.random() * 101) - 50);
			//중복값 검사
			for (int j = 0; j < i ; j++) {
				if ( array[i] == array[j]) {
					array[i] = (int)((Math.random() * 101) - 50);
					j = -1;
				}
			}
		}
		System.out.println("배 열 의  개수\t: " + n);
		System.out.print("배열 내 난수값\t: ");
		for (int i = 0; i < n; i++) {
			if (i < n - 1)
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i]);
		}
		System.out.println();
		
		//최대값
		int max = array[0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] < array[j] && max < array[j])
					max = array[j];
			}
		}
		System.out.println("최대값\t\t: " + max);
		
		//최소값
		int min = array[0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] > array[j] && min > array[j])
					min = array[j];
			}
		}
		System.out.println("최소값\t\t: " + min);
		
		//평균값, 실수
		float avg = 0.0f;
		for (int i = 0; i < n; i++) {
			avg += array[i];
		}
		avg = avg / n;
		System.out.println("평균값\t\t: " + avg);
		
		//범위 구간별 난수 개수 히스토그램 출력
		System.out.println("히스토그램");
		for (int i = -50; i < 50 ; i+=10) {
			String star = "";
			for (int j = 0; j < n; j++) {
				if (array[j] >= i && array[j] < i + 10)
					star += "*";
			}
			if (i == -10)
			System.out.println("  " + i + " ~  " + (i+9) + " : " + star);
			else if (i == 0)
				System.out.println("    " + i + " ~   " + (i+9) + " : " + star);
			else if (i == 40)
				System.out.println("   " + i + " ~  " + (i+10) + " : " + star);
			else if (i < 0)
				System.out.println("  " + i + " ~ " + (i+9) + " : " + star);
			else
				System.out.println("   " + i + " ~  " + (i+9) + " : " + star);
		}
	}

}
