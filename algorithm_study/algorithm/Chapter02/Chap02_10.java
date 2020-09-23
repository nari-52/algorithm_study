package Chapter02;

public class Chap02_10 {

	public static void main(String[] args) {

		int counter = 0;
		int ptr = 0; // 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		
		prime[ptr++] = 2; // prime[0] = 2
		
		for (int n=3; n<=1000; n += 2) { // 홀수만 나눠본다 (짝수는 어차피 2로 나누어 떨어짐)
			int i;
			for (i=1; i< ptr; i++) {
				counter++;
				if(n % prime[i] == 0) {
					break;
				}
			}
			if (ptr == i) { // 찾은 소수의 개수와 나누는 숫자가 같아지는 경우
				prime[ptr++] = n;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}

}
