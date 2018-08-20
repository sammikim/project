package com.xcurenet.prs;

public class PermMissingElem {

	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 5 };
		solution(A);
	}

	public static int solution(int[] A) {
		if (A.length == 0)
			return 1;

		int sumOfAllNumbers = 0;
		for (int num : A) {
			sumOfAllNumbers += num;
		}
		long N = A.length;
		
		long expectedSumOfAllNumbers = ((N + 1) * (N + 2)) / 2;

		long missingNumber = expectedSumOfAllNumbers - sumOfAllNumbers;

		return (int) missingNumber;
	}
}
