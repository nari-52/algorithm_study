package Chapter01;

public class Bubble {

	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 0}; // 데이터 n개 n-1번 비교
		
		System.out.println("====정렬 전====");
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d", arr[i]);
		}
		System.out.println();
		
		for (int i=0; i < arr.length-1; i++) {
			for (int j=0; j < arr.length -1; j++) {
				if( arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	
		
		System.out.println("\n====정렬 후====");
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d", arr[i]);
		}
		
	}

}
