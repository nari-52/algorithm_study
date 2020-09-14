package Chapter02;

public class Chap02_3 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b = a.clone(); // a배열을 복제한다.
		
		b[3] = 0; // 4번쨰 배열 값을 0 으로 초기화 한다.
		
		System.out.print("a = ");
		for (int i=0; i < a.length; i++) {
			System.out.print(" "+ a[i] );
		}
		
		System.out.print("\nb = ");
		for (int i=0; i < b.length; i++) {
			System.out.print(" "+ b[i] );
		}

	}

}
