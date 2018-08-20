package com.xcurenet.prs;

public class Sort {
	
	
	
	/**
	 * ���� ����(selection sort)�� 
	 * ��ü ���ҵ� �߿��� ���� ��ġ�� �´� ���Ҹ� �����Ͽ� �ڸ��� ��ȯ�ϴ� ������� ����
	 * 
	 */
	public void selectionSort(int a[]) {
		
		for(int i =0; i <a.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) { //��������
					min = j;
				}
			}
			swap(a, min, i);
			System.out.printf("\n ���� ���� %d �ܰ� : " , i + 1);
			for(int v : a ){
				System.out.printf("%3d", v);
			}
		}
	}
	
	  /**
     * ���� ����(Bubble Sort)�� ������ �ΰ��� ���Ҹ� ���Ͽ� �ڸ��� ��ȯ�ϴ� ������� ����
     * ù��° ���Һ��� ������ ���ҳ��� ��� �ڸ��� ��ȯ�ϸ鼭 �� �������ڸ��� �̵��ϴ� �����
     * ���ӿ��� �� ���� �ö���� ����� ���� ���ٰ� �ؼ� ���� �����̶�� �Ѵ�.
     */



	public void bubbleSort(int a[]) {
		int size = a.length;
		for(int i = size-1; i >0; i--){
			System.out.printf("\n ���� ���� %d �ܰ� :", size - i);
			for(int j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
				System.out.printf("\n\t");
				for(int v : a) {
					System.out.printf("%3d ", v);
				}
			}
		}
		System.out.println();
	}
	
	 /**
     * ���� ����(Insert Sort)�� ���ĵǾ� �ִ� �κ����տ� ���ο� ������ ��ġ�� ã�� �����ϴ� ���Ĺ��
     *                          S(Sorted)�� U(Unsorted) 
     * @param a
     */
	
	public void insertSort(int a[]) {
		int size = a.length;
		for(int i =1; i < size; i ++) {
			int temp = a[i];
			int j = i;
			
			while( (j > 0) && (a[j-1] >temp)) {
				a[j] = a[j-1];
				j--;
			}
			
			a[j] = temp;
			System.out.printf("\n �������� %d �ܰ� : ", i);
			for(int v : a) {
				System.out.printf("%3d",v);
			}
		}
		System.out.println();
	}
	
	
	public void swap(int a[], int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
