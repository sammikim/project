package com.xcurenet.prs;

public class SolrExam {

	public static void main(String[] args) {
		
		  //[��������] �׽�Ʈ
        System.out.println("=====[��������]=====");
        int a[] = {68, 9, 32, 2, 14, 7, 31, 26};        
        Sort s = new Sort();
        System.out.printf("\n������ ���� :");
        for(int v : a) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.selectionSort(a);
        
        
        //[��������] �׽�Ʈ            
        System.out.println();
        System.out.println("=====[��������]=====");
        int b[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n������ ���� :");
        for(int v : b) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.bubbleSort(b);
		
		
		//[��������] �׽�Ʈ            
        System.out.println();
        System.out.println("=====[��������]=====");
        int c[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n������ ���� :");
        for(int v : c) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.insertSort(c);

	}
}
