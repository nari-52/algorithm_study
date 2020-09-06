package Chapter01_Prac;

public class Q5 {

	// 중앙값 메서드 다음와 같이 작성하면 효율 떨어지는 이유?
	static int med3 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (b <= a && c > b))
			return b;
		return c;
	}
	/*
		c의 값을 내기 위해서는 첫번째 if 문과 두번째 else if 문의 조건을 모두 검사 해 봐야만 값이 나오므로
		불필요한 조건 검가사 계속되어 효율이 떨어진다.
		(답) if 문에서 첫번쨰 조건이 맞아도 그 다음 조건을 실행해 보도록 설계되어 효율이 나빠진다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
