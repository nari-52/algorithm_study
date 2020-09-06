package Chapter01_Prac;

import java.util.Scanner;

public class Q11 {
	// 자릿수 계산
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int result = 0;
		
		System.out.println("자릿수를 계산합니다.");
		
		System.out.print("원하는 숫자 : ");
		int n = stdIn.nextInt();
		int remainder = n;
		
		do {
			result += 1;
			remainder = remainder/10;
		} while(remainder >= 1);
		
		System.out.println(n +"의 자리수는 : "+ result);

	}

}
