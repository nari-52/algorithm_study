package Chapter01;

import java.util.Scanner;

public class Chap01_6C {
	// 2자리의 양수 (10 ~ 99) 입력
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = stdIn.nextInt();
		} while( no < 10 || no > 99 ); // while문 조건에 부합하면 다시 do 반복한다.
		
		System.out.println("변수 no 값: " + no);
		
	}

}
