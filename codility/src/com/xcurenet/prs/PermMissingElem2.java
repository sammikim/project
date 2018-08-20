package com.xcurenet.prs;

public class PermMissingElem2 {

	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 5 };
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		if(A.length == 0 ){
			return 1;
		}
		
		int sumofNum = 0;
		for(int num : A) {
			sumofNum += num;
		}
		long N = A.length;
		long totalSumNum = ((N+1) * (N+2)) / 2;
		
		long result = totalSumNum - sumofNum;
		
		return (int) result;
	}
}
