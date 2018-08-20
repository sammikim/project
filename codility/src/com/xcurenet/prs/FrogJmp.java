package com.xcurenet.prs;

public class FrogJmp {

	public static void main(String[] args) {
		int a = 10;
		int b = 85;
		int c = 30;
		System.out.println(solution(a, b, c));

	}
	
	public static int solution(int X, int Y, int D) {
		int count = 0;
		int firstJump = X;
		int secondJump = D;
		int standdard = Y;
		
		while(true) {
			if( firstJump < standdard) {
//				secondJump += firstJump;
				firstJump += secondJump;
				count++;
			}
			
			if(firstJump >= standdard) {
				break;
			}
		}
		return count;
	}
}
