package less4;

public class test1 {

	public static void main(String[] args) {
		int[] A = { 5, 3, 9, 13};
		int[] B = {5,3,9,13};
		
		solution(A, 7);
	}
	
	public static  boolean solution(int[] arr, int n) {
		boolean answer = false;
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < arr.length; i++) {
			for(j =  i + 1; j < arr.length; j++) {
				if( arr[i] + arr[j] == n) {
					answer = true;
					break;
				}
			}
		}
		
		return answer;
	}

}
