package com.hr.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A left rotation operation on an array of size n shifts each of the array's
 * elements 1 unit to the left. For example, if 2 left rotations are performed
 * on array [1,2,3,4,5] , then the array would become [3,4,5,1,2] .
 * 
 * Given an array of n integers and a number, d, perform d left rotations on the
 * array. Then print the updated array as a single line of space-separated
 * integers.
 * 
 * 
 * Input Format
 * 
 * The first line contains two space-separated integers denoting the respective
 * values of (the number of integers) and (the number of left rotations you must
 * perform). The second line contains space-separated integers describing the
 * respective elements of the array's initial state.
 * 
 * Constraints
 * 1<= n <= 10^5
 * 1<=d<=n
 * 1<=ai<=10^6
 * 
 * Output Format
 * 
 * Print a single line of n space-separated integers denoting the final state of
 * the array after performing d left rotations.
 * 
 * 
 * 
 * @author rizwan
 *
 */
public class ArrayLeftRotation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		
		int[] a =  new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		s.close();
		int[] r =  rotateLeft(a,n,d);
		
		System.out.println(Arrays.toString(r));
	}

	private static int[] rotateLeft(int[] a, int n, int d) {
		int[] r = new int[n];
		System.arraycopy(a, d, r, 0, n-d);
		System.arraycopy(a, 0, r, n-d, d);
		return r;
	}
}
