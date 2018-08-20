package com.xcurenet.prs;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		Solution(A);
	
	}
	
	public static void Solution(int[] A) {
//		int temp  = 0;
//		int result;
//		for(int i = 0; i < A.length; i++){
//			temp = temp ^ A[i];
//			System.out.println(temp);
//		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : A) {
			if(set.contains(i)) {
//				System.out.println(i);
				set.remove(i);
			}else {
				System.out.println(i);
				set.add(i);
			}
		}
//		return set.iterator().next();
	}
	
}
