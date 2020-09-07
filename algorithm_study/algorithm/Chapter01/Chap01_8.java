package Chapter01;

import java.util.Scanner;

public class Chap01_8 {
	// 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형을 출력합니다.");
		
		int n;
		
		do {
			System.out.print("변 수 입력: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		System.out.println("----------------------------------");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("*");
			System.out.println();
		}

	}

}
