package com.hr.string;

import java.util.Scanner;

/**
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string. In other words, both
 * strings must contain the same exact letters in the same exact frequency For
 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * 
 * Alice decides on an encryption scheme involving two large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. Can you help her find this number?
 * 
 * Given two strings, and , that may or may not be of the same length, determine
 * the minimum number of character deletions required to make and anagrams. Any
 * characters can be deleted from either of the strings.
 * 
 * Input Format
 * 
 * The first line contains a single string, . The second line contains a single
 * string, .
 * 
 * Constraints
 * 1<=|a|,|b|<=10^4
 * 
 * It is guaranteed that and consist of lowercase English alphabetic letters
 * (i.e., through ). Output Format
 * 
 * Print a single integer denoting the number of characters you must delete to
 * make the two strings anagrams of each other.
 * 
 * @author rizwan
 * Algorithm : 
 * Make use of the counter functionality on the arrays to decide the anagram
 * Then use the substraction between the unequal counters till the counter same.
 */
public class MakingAnagram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String first = s.next();
		String second = s.next();
		s.close();

		int nd = numberOfCharactersDeleted(first,second);
		System.out.println(nd);
	}

	private static int numberOfCharactersDeleted(String first, String second) {
		int[] fa = new int[26];
		int[] sa = new int[26];
		
		for(char c : first.toCharArray()){
			fa[c-'a']++;
		}
		for(char c : second.toCharArray()){
			sa[c-'a']++;
		}
		int nd_l = 0;
		for(int i=0;i<26;i++){
			nd_l += Math.abs(fa[i] - sa[i]);
		}
		
		return nd_l;
	}

}
