package Chapter01_Prac;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n의 값을 입력하세요 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		String result = "1";
		
		for (int i=1; i <= n; i++) {
			
			if (i != 1 ) {
				result += " + "+ i;
			}
			sum += i;

		}
		
		System.out.println(result + " = " + sum);
		
		// ------------------------------------------------------ 답
		
		/*
		 * Scanner stdIn = new Scanner(System.in);
		 * 
		 * System.out.println("1부터 n까지의 합을 구합니다."); 
		 * System.out.print("n의 값："); 
		 * int n = stdIn.nextInt();
		 * 
		 * int sum = 0; // 합
		 * 
		 * for (int i = 1; i <= n; i++) { 
		 * 	if(i < n) 
		 * 			System.out.print(i + " + "); 
		 * 	else
		 * 			System.out.print(i); sum += i; // sum에 i를 더함 
		 * } 
		 * 
		 * System.out.println(" = " + sum);
		 */

	}

}
