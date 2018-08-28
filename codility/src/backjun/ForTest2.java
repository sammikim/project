package backjun;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		int N = 0;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		
		for(int i = N; i > 0; i--){
			System.out.println(i);
		}
	}
}
