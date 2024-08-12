package array.programs;

public class PrintDupEleOfAnArray {

	public static void main(String[] args) {
		int[] A = {1,2,4,3,2,5,6,4,3,2};
		System.out.println("Duplicate elements in given array: ");
		for(int i =0; i<A.length;i++) {
			for(int j=i+1; j<A.length;j++)
			if(A[i]==A[j]) {
				System.out.println(A[j]);
			}
		}
		
	}
}
