package Chapter02;

public class Chap02_1 {
	
	public static void main(String[] arg) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2; // 74
		
		for (int i=0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		
	}

}
