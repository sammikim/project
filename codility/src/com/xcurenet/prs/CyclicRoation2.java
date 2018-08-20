package com.xcurenet.prs;

public class CyclicRoation2 {
	public static void main(String[] args) {
		int K = 3;
		int[] A = { 3, 8, 9, 7, 6 };
		

		solution(A, K);
	}

	public static int[] solution(int[] A, int K) {
		int temp;
		int countMove;

		if (A.length != 0) {

			countMove = K % A.length;

			for (int i = 0; i < countMove; i++) {
 
				temp = A[A.length - 1];
				System.out.println(temp);

				for (int j = (A.length - 2); j >= 0; j--) {
					// A[j+1] = A[j];
					int a = A[j];
					int b = A[j + 1];
					System.out.println("a :" + a);
					System.out.println("b : " + b);
				}

				A[0] = temp;
			}
		}
		return A;
	}

}
