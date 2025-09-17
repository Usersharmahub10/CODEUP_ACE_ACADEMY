//This programe gives the string with character frequency of every character entered
//class owner : Harshit Sharma
//date : 16-09-2025


import java.util.Scanner;

public class CharacterFrequency{
	static String characterFreq(){
		Scanner sc = new Scanner(System.in);
		String strInput = sc.nextLine();
		
		if(strInput == null ){
			System.out.println("Empty string entered");
			return "Empty String Entered";
		}
		
		int count = 1;
		String result = "";
		for(int i = 0 ; i < strInput.length(); i++){
			if(  i+1 < strInput.length() && strInput.charAt(i) == strInput.charAt(i+1) ){
				count++;
			} else {
				result = result + strInput.charAt(i);
				result = result + count;
				count = 1;
			}
		}
	
		return result;
		
}
	public static void main(String[] args){
		
		String output = characterFreq();
		System.out.println(output);
	}
}