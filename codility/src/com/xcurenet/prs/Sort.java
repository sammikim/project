package com.xcurenet.prs;

public class Sort {
	
	
	
	/**
	 * 선택 정렬(selection sort)는 
	 * 전체 원소들 중에서 기준 워치에 맞는 원소를 선택하여 자리를 교환하는 방식으로 정렬
	 * 
	 */
	public void selectionSort(int a[]) {
		
		for(int i =0; i <a.length - 1; i++) {
			int min = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[min]) { //오름차순
					min = j;
				}
			}
			swap(a, min, i);
			System.out.printf("\n 선택 정렬 %d 단계 : " , i + 1);
			for(int v : a ){
				System.out.printf("%3d", v);
			}
		}
	}
	
	  /**
     * 버블 정렬(Bubble Sort)은 인접한 두개의 원소를 비교하여 자리를 교환하는 방식으로 정렬
     * 첫번째 원소부터 인접한 원소끼리 계속 자리를 교환하면서 맨 마지막자리로 이동하는 모습이
     * 물속에서 물 위로 올라오는 물방울 모양과 같다고 해서 버블 정렬이라고 한다.
     */



	public void bubbleSort(int a[]) {
		int size = a.length;
		for(int i = size-1; i >0; i--){
			System.out.printf("\n 버블 정렬 %d 단계 :", size - i);
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
     * 삽입 정렬(Insert Sort)은 정렬되어 있는 부분집합에 새로운 원소의 위치를 찾아 삽입하는 정렬방식
     *                          S(Sorted)와 U(Unsorted) 
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
			System.out.printf("\n 삽입정렬 %d 단계 : ", i);
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
