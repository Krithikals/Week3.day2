package week3.day2;

import java.util.ArrayList;

import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	 int[] arr1= {3,2,11,4,6,7};
	 int[] arr2= {1,2,8,4,9,7};
	 
	 List<Integer> listArr1= new ArrayList<Integer>();
	 List<Integer> listArr2= new ArrayList<Integer>();
	 
	for (int i = 0; i < arr1.length; i++) {
		listArr1.add(arr1[i]);
	}
    for (int j = 0; j < arr2.length; j++) {
    	listArr2.add(arr2[j]);
	}
    System.out.println("1st Array list " + listArr1);
    System.out.println("2nd Array list " + listArr2);
    listArr1.retainAll(listArr2);
    System.out.println("Post intersection " + listArr1);
   
	}

}
