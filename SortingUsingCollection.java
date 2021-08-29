package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class SortingUsingCollection {

	public static void main(String[] args) {

		String[] str= {"Aspire systems","cts","wipro","Hcl"};
		
		List<String> list1= new ArrayList<String>(Arrays.asList(str));
		Collections.sort(list1);
		System.out.println(list1);
		for (String stringName : list1) {
			System.out.println(stringName );
		}
		System.out.println("*******************Reversing the list*******************");
		Collections.reverse(list1);
		System.out.println(list1);
		for (String stringName : list1) {
			System.out.println(stringName );
		}

	}

}
