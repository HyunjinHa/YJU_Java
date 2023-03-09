package test;
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		// 5 * 5 이차원 배열
		final int N = 5;
		// 생성한 난수를 임시로 담을 배열 선언
		int randomMatrix[] = new int[N*N];
		// 중복값 검사 후 사용할 이차원 배열 선언
		int resultMatrix[][] = new int[N][N];
		//중복값 검사
		for (int i = 0; i < N * N; i++) {
			randomMatrix[i] = (int)((Math.random() * 50) + 1);
			for (int j = 0; j < i; j++) {
				if ( i != j && randomMatrix[i] == randomMatrix[j]) {
					randomMatrix[i] = (int)((Math.random() * 50) + 1);
					j = -1;
				}
			}
		}
		// 이차원 배열에 난수 저장
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				resultMatrix[i][j] = randomMatrix[N * i + j];
				System.out.print( "\t " + resultMatrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("열");
		System.out.print("최소값");
		for (int i = 0; i < N; i++) {
			int min = resultMatrix[0][i];
			for (int j = 0; j < N; j++) {
				if ( min > resultMatrix[j][i]) {
					min = resultMatrix[j][i];
				}
			}
			System.out.print( "\t " + min);
		}
		System.out.println();
		
		System.out.print("최대값");
		for (int i = 0; i < N; i++) {
			int max = resultMatrix[0][i];
			for (int j = 0; j < N; j++) {
				if ( max < resultMatrix[j][i]) {
					max = resultMatrix[j][i];
				}
			}
			System.out.print( "\t " + max);
		}
		System.out.println();
		
	}
}
