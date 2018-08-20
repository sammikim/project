package com.xcurenet.prs;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int A [] = {3,1,2,4,3};
		System.out.println(Solution(A));
	}
	
	public static  int Solution(int A[]) {
		int sum = 0;
		for(int i =0; i < A.length; i ++) {
			sum += A[i];
		}
		System.out.println(sum);
		
		int firstpartSum = 0;
		int secondPartSum = 0;
		int difference = 0;
		int minDifference = Integer.MAX_VALUE;
		for( int P = 1;  P < A.length; P++) {
			firstpartSum += A[P-1];
			secondPartSum = sum - firstpartSum;
			System.out.println("a :" +firstpartSum);
			System.out.println("b :" +secondPartSum);
			difference = Math.abs(firstpartSum - secondPartSum);
			System.out.println( "ABS : " + difference);
			
			if(difference < minDifference) {
				minDifference = difference;
			}
		}
		
		return minDifference;
	}

}
