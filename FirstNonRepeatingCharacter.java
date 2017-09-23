
import java.util.Scanner;

/**
 *@author Vijay Prasath Muralidharan
 *@22-Sep-2017
 */
public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		System.out.println("Enter the string below to find first non repeating character: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i,j = 0;

		restart:
		for(i=0;i<s.length();) {
			char c = s.charAt(i);
			for(j=1;j<=s.length()-1;j++) {
					  char next = s.charAt(j);
					  if(c == next) {
						  s = s.replaceAll(String.valueOf(c), "");
						  continue restart;
					  }  
				 }
			i++;
		}
		System.out.println("The First non repeating character is - "+s.substring(0, 1));
	}
	}


