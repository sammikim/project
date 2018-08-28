package backjun;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		int N = 0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}
