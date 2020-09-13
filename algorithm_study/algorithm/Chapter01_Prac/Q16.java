package Chapter01_Prac;

import java.util.Scanner;

public class Q16 {
	// 왼쪽 위가 직각인 이등변삼각형을 출력
	static void triangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	// 오른쪽 위가 직각인 이등변삼각형을 출력
	static void triangleRU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i ;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형을 출력합니다.");
		
		int n;
		
		do {
			System.out.print("변 수 입력: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		System.out.println("----------------------------------");
		triangleLU(n);
		System.out.println("----------------------------------");
		triangleRU(n);
		System.out.println("----------------------------------");
		triangleLB(n);

	}

}
