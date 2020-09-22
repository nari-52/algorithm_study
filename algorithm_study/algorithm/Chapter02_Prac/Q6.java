package Chapter02_Prac;

import java.util.Scanner;

public class Q6 {
	
	// 입력받은 10진수를 2 ~ 36 진수로 기수 변환하여 나타내기
	static int cardConv(int x, int r, char[] d) {
		int digits = 0; // 변환수의 자릿수를 나타내기 위한 변수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = temp;
		}
		return digits;
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no, cd, dno, retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 : ");
			for(int i= 0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("\n------------------");
			
			System.out.print("한번 더 할까요? (1. 예 / 2. 아니오) : ");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}

}
