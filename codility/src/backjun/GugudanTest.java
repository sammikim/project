package backjun;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 sc.close();
		 
		 for(int i = 1; i <=9; i++){
			 System.out.printf("%d * %d = %d",n, i ,(n*i));
			 System.out.println();
		 }
	}
}
