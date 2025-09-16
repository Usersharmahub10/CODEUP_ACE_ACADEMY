//This programe gives the string with character frequency of every character entered
//class owner : Harshit Sharma
//date : 16-09-2025


import java.util.*;

public class CharacterFrequency{
	static void characterFreq(String input){
		if(input == null ){
			System.out.println("Empty string entered");
			return ;
		}
		
		StringBuilder str = new StringBuilder();
		int count = 1;
		char current = input.charAt(0);
		
		for(int i = 1 ; i < input.length() ; i++){
			if(current == input.charAt(i)){
				count++;
			} else {
				str.append(current).append(count);
				current = input.charAt(i);
				count = 1;
			}
		}
		str.append(current).append(count);
		
		System.out.println(str);
		
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		characterFreq(str);
	}
}