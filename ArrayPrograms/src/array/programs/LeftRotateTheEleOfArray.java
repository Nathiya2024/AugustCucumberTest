package array.programs;

import java.util.Scanner;

public class LeftRotateTheEleOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n = s.nextInt();
		int[] A=new int[n];
		//Input array elements
		System.out.println("Enter the elements: ");
		for(int i = 0; i<n; i++) {
			A[i]=s.nextInt();
		}
		//input no.of positions to rotate
		System.out.println("Enter the number of positions to rotate" );
		int k=s.nextInt();
		
		k=k%n;
		rotateLeft(A,k);
		System.out.println("Array after left rotation: ");
		for(int A1: A) {
			System.out.println(A1+" ");
		}
	}
		public static void rotateLeft(int[] A, int k) {
			int n	 = A.length;
			int[] tempArray = new int[n];
			for(int i = 0; i<n; i++) {
				tempArray[i]=A[(i+k)%n];
			}
			for(int i =0;i<n;i++) {
				A[i]=tempArray[i];
			}
		}
					
	}


