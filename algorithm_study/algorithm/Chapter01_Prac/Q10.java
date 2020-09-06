package Chapter01_Prac;

import java.util.Scanner;

public class Q10 {
	// b-a 구하는 식(b > a일 때만)
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		int result = 0;
		
		System.out.println("b - a 값을 구합니다.");
		
		do {
			System.out.print("a의 값 : ");
			a = stdIn.nextInt();
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if(a >= b)
				System.out.println("a값보다 큰 값을 입력하세요! (b>a)");
		} while (b <= a);
		
		result = b-a;
		
		System.out.println(b +"-" + a +"="+result);

	}

}
