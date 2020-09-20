package Chapter02_Prac;

import java.util.Scanner;

public class Q5 {
	// 배열 b의 모든 요소를 배열 a에 역순으로 저장하라
	static void rcopy(int[] a, int[] b) {
		
		for(int i=0; i<b.length; i++) {
			int j=b.length-1-i;
			a[i] = b[j];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수 : ");
		int numb = stdIn.nextInt();
		
		int[] b = new int[numb];
		
		for(int i=0; i<numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		int[] a = new int[numb];
		rcopy(a, b);
		
		System.out.println("----------------------------------");
		
		for(int i=0; i<numb; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}
}
