package Chapter02;

public class Chap02_8A {
	// 입력받은 10진수를 2 ~ 36 진수로 기수 변환하여 나타내기

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; // 변환수의 자릿수를 나타내기 위한 변수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		return digits;
		
	}

}
