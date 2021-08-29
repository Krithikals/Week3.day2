package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		Set<Integer> setInt = new LinkedHashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			boolean add = setInt.add(arr[i]);
			if (!add) {
				System.out.println("The Duplicate value is " + arr[i]);
			}
		}

		System.out.println("The array post removing Duplicate is " + setInt);
	}

}
