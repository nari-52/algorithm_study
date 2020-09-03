package Chapter01;

public class Chap01_2 {
	
	// 3개의 정수값 가운데 최대값을 출력
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(1,2,3) = " + max3(1,2,3));
		System.out.println("max3(121,22,343) = " + max3(121,22,343));

	}

}
