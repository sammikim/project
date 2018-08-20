package com.xcurenet.prs;

import java.util.Scanner;

public class bakjunTest {
	static int n;  
	static int b; 
	static int c; 
	static long ans; 
	static int[] a  = new int[1000001];  
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(int i = 0; i <n; i++){
			a[i] = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
		}
		for(int i=0; i < n; i++){
			++ans;
			a[i] -= b;
			ans += (a[i] % c == 0 ? a[i]/c : a[i]/c+1);
		}
		System.out.println(ans);
		in.close();
	}
}
