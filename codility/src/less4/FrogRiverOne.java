package less4;

public class FrogRiverOne {

	public static void main(String[] args) {
		int A[] = {1,3,1,4,2,3,5,4};
		
		solution(6, A);
	}
	
	public static int solution(int X, int A[]) {
		int leafList[] = new int[X+1];
		
		for(int i = 0; i < leafList.length; i++) {
			leafList[i] = -1;
		}
		
		for(int i = 0; i < A.length; i ++) {
			int leaf = A[i];
			System.out.println(leaf);
			if(leaf <= X) {
				if(leafList[leaf] == -1) {
					leafList[leaf] = i;
				} else {
					leafList[leaf] = Math.min(i, leafList[i]);
				}
			}
		}
		
		for(int i = 0; i <leafList.length; i++) {
			System.out.println(leafList[i]);
		}
		
		System.out.println("TT");
		System.out.println("TT");
		
//		for(int i = 0; i < A.length; i++) {
//			System.out.println(A[i]);
////			System.out.println(i);
//		}
		
		
		return -1;
	}
}
