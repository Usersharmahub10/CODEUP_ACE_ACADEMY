//This programe gives the length of longest substring without repeating characters
//class owner : Harshit Sharma
//date : 16-09-2025


import java.util.Scanner;
public class LengthOfSubstring{
	
	static int lengthOfSubstring(String input){
		boolean[] visitChar = new boolean[256]; 
		int start = 0;
		int end = 0;
		int maxLength = 0;
		
		while(end < input.length()){
			char currentChar = input.charAt(end);
			
			if(!visitChar[currentChar]){
				visitChar[currentChar] = true;
				end++;
				maxLength = (maxLength > end-start) ? maxLength : end-start;
			} else {
				visitChar[input.charAt(start)] = false;
				start++;
			}
		}
		
		return maxLength;
		
	}
	public static void main(String[] args){
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String strInput = sc.nextLine();
		int output = lengthOfSubstring(strInput);
		System.out.println("Length is : "+output);
	}
}