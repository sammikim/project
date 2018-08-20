package com.xcurenet.prs;

public class SolrExam {

	public static void main(String[] args) {
		
		  //[선택정렬] 테스트
        System.out.println("=====[선택정렬]=====");
        int a[] = {68, 9, 32, 2, 14, 7, 31, 26};        
        Sort s = new Sort();
        System.out.printf("\n정렬할 원소 :");
        for(int v : a) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.selectionSort(a);
        
        
        //[버블정렬] 테스트            
        System.out.println();
        System.out.println("=====[버블정렬]=====");
        int b[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n정렬할 원소 :");
        for(int v : b) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.bubbleSort(b);
		
		
		//[삽입정렬] 테스트            
        System.out.println();
        System.out.println("=====[삽입정렬]=====");
        int c[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n정렬할 원소 :");
        for(int v : c) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.insertSort(c);

	}
}
