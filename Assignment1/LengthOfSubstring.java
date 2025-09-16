//This programe gives the length of longest substring without repeating characters
//class owner : Harshit Sharma
//date : 16-09-2025


import java.util.*;

public class LengthOfSubstring{
	
	static void lengthOfSubstring(String input){
		ArrayList<Character> list = new ArrayList<Character>();
		
		int start = 0;
		int end = 0;
		int maxLength = 0;
		while(end < input.length()){
			if(!list.contains(input.charAt(end))){
				list.add(input.charAt(end));
				end++;
				maxLength = Math.max(maxLength, list.size());
			} else {
				list.remove(Character.valueOf(input.charAt(start)));
				start++;
			}
		}
		System.out.println(maxLength);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String enter = sc.nextLine();
		lengthOfSubstring(enter);
	}
}