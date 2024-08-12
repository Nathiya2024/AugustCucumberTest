package array.programs;

import java.util.Arrays;

public class CopyEleofOneArrayToAnotherArray {
public static void main(String[] args) {
	int[] A = {1,2,3,4,5,6};
	//Method 1
//	//create a copy array with the length of original array
//	int[] copyA= new int[A.length];
//	//need to copy the element from the original array.
//	for(int i=0; i<A.length; i++) {
//		copyA[i]=A[i];
//			}
//	//Print the copy array by using for each loop
//	for(int A1: copyA) {
//		System.out.println(A1+" ");
//	}
//	
	//Method 2
	int[] copyA=Arrays.copyOf(A, A.length);
	for(int A1: copyA) {
		System.out.println(A1+" ");
	}
}
}
