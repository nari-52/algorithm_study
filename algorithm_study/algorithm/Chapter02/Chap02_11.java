package Chapter02;

public class Chap02_11 {
	
	public static void main(String[] args) {

		int counter = 0;
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		
		prime[ptr++] = 2; // prime[0] = 2
		prime[ptr++] = 3; // prime[1] = 3
		
		for (int n=5; n<=1000; n += 2) { // 홀수만 나눠본다 (짝수는 어차피 2로 나누어 떨어짐)
			boolean flag = false;
			for (int i=1; prime[i]*prime[i] <= n; i++) {
				counter += 2;
				if(n % prime[i] == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) { // false인 경우
				prime[ptr++] = n;
				counter ++;  
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}

}
