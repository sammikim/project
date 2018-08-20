package com.xcurenet.prs;

public class BinaryGap2 {
	
	public static void main(String[] args) {
		
		solutionloop(35);
		
	}
	
	static int solutionloop(int n){
		int current = 0;
		int max = 0;
		while( n > 0) {
			if( n % 2 == 0){
				++current;
				System.out.println("current : " + current);
			} else {
				max = Math.max(max, current);
				current = 0;
				System.out.println("max1 : " + max);
			}
			n /= 2;
			System.out.println("n : " + n);
		}
		System.out.println( "max  :" +  max);
		return max;
	}


}
