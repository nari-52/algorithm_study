package Chapter01_Prac;

import java.util.Scanner;

public class Q14 {
	// 입력한 수를 한 변으로 하는 정사각형 출력 (*기호로)
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		
		int n;
		
		do {
			System.out.print("변 수 입력: ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		System.out.println("----------------------------------");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.printf("*");
			System.out.println();
		}

	}

}
