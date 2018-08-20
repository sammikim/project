package less4;

import java.util.Arrays;

public class skp1 {

	public static void main(String[] args) {
		int[] A = { 5, 3, 9, 13};
		
		System.out.println(solution(A, 7));
	}
	public static  boolean solution(int[] arr, int n) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length -1;
		int sum;
		
		while( i < j) {
			sum =  arr[i] + arr[j];
			if( sum == n){
				return true;
			}else if (sum > n) {
				j -= 1;
			} else {
				i += 1;
			}
		}
		return false;
	}
}
