package Chapter01_Prac;

public class Q12 {
	//위쪽과 왼쪽에 곱하는 수가 있는 곱셈표

	public static void main(String[] args) {
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}
	
//	public static void main(String[] args) {
//	System.out.println("==== 곱셈표 ====");
//	
//	for (int i=1; i<=9; i++) {
//		
//		for(int j=1; j<=9; j++) {
//			/*
//			 * if (i==1&&j==1) { System.out.print("   |"); }
//			 */
//			if (j==1) {
//				// System.out.print("여기는?");
//				System.out.printf("%3d", i*j);
//				System.out.print("|");
//				System.out.printf("%3d", i*j);
//			}
//			else {
//				System.out.printf("%3d", i*j);
//			}
//			
//		}
//		
//		if (i == 1 ) {
//			System.out.println();
//			System.out.println("---+------------------------------");
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%3d", i*j);
//				i = 1;
//			}
//		}
//		System.out.println();
//	}
//}
}
