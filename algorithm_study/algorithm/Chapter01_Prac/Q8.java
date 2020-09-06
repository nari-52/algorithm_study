package Chapter01_Prac;

import java.util.Scanner;

public class Q8 {
	// 가우스 덧셈을 이용한 1 .. n 까지의 정수의 합
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n 값을 입력하세요 :");
		int n = stdIn.nextInt();
		
		double sum = (1 + n) * (double)n/2;
		// 소수점 보여주기 위해 double 형으로 형변환
		
		System.out.println("합 : " + (int)sum);
		// 결과값 예쁘게 보여주기 위해 int 형으로 형변환

		
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
//
//		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		
		
	}

}
