package Chapter01_Prac;

import java.util.Scanner;

public class Q9 {
	// 정수 a, ... ,b 사이의 모든 정수의 합을 구하라 (a,b포함)
	static int sumof(int a, int b) {
		
		int sum = 0;
		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a 값 입력 : ");
		int a = stdIn.nextInt();
		System.out.print("b 값 입력 : ");
		int b = stdIn.nextInt();

		System.out.println("입력하신 두 수 사이의 값 : " + sumof(a,b));
	}

}
