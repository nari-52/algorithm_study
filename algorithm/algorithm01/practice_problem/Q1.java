package practice_problem;

import java.util.Scanner;

public class Q1 {
	// 네 값의 최대값을 구하는 max4 메서드 작성
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.println("네 정수값의 최대값 구하기");
		
		System.out.print("a의 값 :");
		int a = stdIn.nextInt();
		System.out.print("b의 값 :");
		int b = stdIn.nextInt();
		System.out.print("c의 값 :");
		int c = stdIn.nextInt();
		System.out.print("d의 값 :");
		int d = stdIn.nextInt();
		
		System.out.println("최대값은 " + max4(a,b,c,d) +" 입니다.");

	}
	
	/*
	 * public static void main(String[] args) {
	 * System.out.println("max4(3,2,1,0) = " + max4(3,2,1,0));
	 * System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
	 * System.out.println("max4(121,22,343,12) = " + max4(121,22,343,12));
	 * 
	 * }
	 */
}
