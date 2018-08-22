package backjun;

import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N >= 3 &&  N <=5000) {
			
			if( N % 5 == 0) {
				System.out.println( N / 5);
				return;
			} else {
				int num5 = N / 5 ;
				for(int i = num5; i > 0; i--) {
					int temp = N-(i*5);
					if(temp % 3 == 0) {
						System.out.println(i + (temp/3));
						return;
					}
				}
			}
			if( N % 3 == 0) {
				System.out.println( N / 3);
			} else {
				System.out.println(-1);
			}
		} else {
			
		}
	}
}
