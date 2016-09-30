package com.hr.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		s.close();
		int[] rr = rotateRight(a,n,d);
		
		System.out.println(Arrays.toString(rr));
	}

	private static int[] rotateRight(int[] a, int n, int d) {
		int[] rr = new int[n];
		System.arraycopy(a, 0, rr, d, n-d);
		System.arraycopy(a,n-d,rr,0,d);
		
		return rr;
	}
}
