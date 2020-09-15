package algorithm_study;

import java.util.Scanner;

public class Programing1 {

	public static void main(String[] args) {
		
		String[] idArr = new String[1];
		
		Scanner stdIn = new Scanner(System.in);
		
		boolean flag = false;
		
		for(int i=0; i<idArr.length; i++) {
			System.out.print("아이디를 입력하세요: ");
			idArr[i] = stdIn.next().toLowerCase();
		}
		//flag = true;

		
		if (!flag) {
			for(int i=0; i<idArr.length; i++) {
				System.out.println("아이디 : " + idArr[i]);
			}
		}
		else {
			System.out.println("아이디 형식이 올바르지 않습니다.");
			for(int i=0; i<idArr.length; i++) {
				System.out.println("추천 아이디 : " + idArr[i]);
			}
			
		}

	}

}
