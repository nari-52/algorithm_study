package Chapter02_Prac;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	
	// 최대값 구하는 메서드
	static int maxOf(int[] a) {
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		
		int num = rand.nextInt(10);
		System.out.println("사람수 : " + num);
		
		int[] height = new int[num];
		
		System.out.println("키값은 아래와 같습니다.");
		for(int i=0; i<height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + " 입니다.");
	}

}
