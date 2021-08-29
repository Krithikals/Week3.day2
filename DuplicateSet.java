package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateSet {

	public static void main(String[] args) {
		
		String str= "Payal India";
		System.out.println(" The orginal text is " + str);
		char[] char1 = str.toCharArray();
		Set<Character> charSet= new LinkedHashSet<Character>();
		//Set<Character> dupcharSet= new LinkedHashSet<Character>();
		 for (int i = 0; i < char1.length; i++) {
			 charSet.add(char1[i]);
		}	
		 //System.out.println(charSet);
		 System.out.println("The text after removing the duplicates");
		 for (Character character : charSet) {
				 System.out.print(character);
		}
		 

	     
		 /*for (Character character : charSet) {
			
		for (int i = 0; i < char1.length; i++) {
			if(char1[i]==character)
			{
				dupcharSet.add(char1[i]);
			}	
			
		}
		}
		 System.out.println(dupcharSet);
		 for (Character character : dupcharSet) {
			 charSet.remove(character);
		}
		 System.out.println(charSet);
		
		*/
   
	}

}
