package Chapter01_Prac;

import java.util.Scanner;

public class Q17 {
	
	// n단의 피라미드 출력
	static void spira(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<2*i; j++) {
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
		spira(n);

	}

}
