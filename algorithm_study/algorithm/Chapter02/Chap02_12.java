package Chapter02;

public class Chap02_12 {
	
	public static void main(String[] args) {
		
		int[][] X = new int[2][4];
		
		X[0][1] = 37;
		X[0][3] = 54;
		X[1][2] = 65;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<4; j++) {
				System.out.println("X["+i+"]["+j+"] = " + X[i][j]);
			}
		}
	}
}
