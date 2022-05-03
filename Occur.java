package boot;

import java.util.Scanner;

public class Occur {

	public static void main(String[] args) {

		/*Challenge 2:
		Write a solution to find the character that has the highest number of occurrences within a certain string, ignoring
	case. If there is more than one character with equal highest occurrences, return the character that appeared first
	within the string.*/
				String str;
				char hichar = ' ';
				int i, max = -1;
				int[] count = new int[256];
				
				Scanner sc= new Scanner(System.in);

				System.out.print("\nEnter String:\n ");
				str = sc.nextLine();
				
				for(i = 0; i < str.length(); i++)
				{
					count[str.charAt(i)]++;
				}
				for(i = 0; i < str.length(); i++) 
				{
					char ch = str.charAt(i);
					if(max < count[ch]) {
						max = count[ch];
						hichar = ch;
					}
				}
				System.out.println("\n Highest Occurrance character is: " +  hichar);
				
				
			
		}
			
	}

