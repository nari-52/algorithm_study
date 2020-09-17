package Chapter02;

import java.util.Scanner;

public class Chap02_7 {
	
	static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}	
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int numa = stdIn.nextInt();
		
		int[] a = new int[numa];
		
		for(int i=0; i<numa; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int numb = stdIn.nextInt();
		
		int[] b = new int[numb];
		
		for(int i=0; i<numb; i++) {
			System.out.print("x[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a, b)?"같습니다." : "같지 않습니다.") );

	}

}
