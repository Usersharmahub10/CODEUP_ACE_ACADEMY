//This programe gives expanded string of each character according to their frequency given
//class owner : Harshit Sharma
//date : 16-09-2025



import java.util.*;

public class ExpandCharacters{
	
	static String expandString(){
		Scanner sc = new Scanner(System.in);
		String stringInput =  sc.nextLine();
		
		String result = "";
		int i = 0;
		while(i < stringInput.length()){
			char currentChar = stringInput.charAt(i);
			i++;
			
			int count = 0;
			
			while(i < stringInput.length() && stringInput.charAt(i) >= '0' && stringInput.charAt(i) <= '9'){
				count = (count*10) + (stringInput.charAt(i) - '0');
				i++;
			}
			for(int j = 0; j < count; j++){
				result+= currentChar;
			}
		}
		
		return result;
	}
	public static void main(String[] args){
		
		String output = expandString();
		System.out.println(output);
	}
}