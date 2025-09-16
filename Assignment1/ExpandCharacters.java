import java.util.*;

public class ExpandCharacters{
	
	static void expandString(String input){
		 char[] ch = input.toCharArray();
		 StringBuilder op = new StringBuilder();
		 
		 for(int i = 0 ; i < ch.length ; i++){
			 if(Character.isLetter(ch[i])){
				 if(Character.isDigit(ch[i+1])){
					 int count = Character.getNumericValue(ch[i+1]);
					 for(int j = 0 ; j < count ;j++){
						 op.append(ch[i]);
					 }
				 } else{
				 op.append(ch[i]);
				 }
			 }
		 }
		 System.out.println(op);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		expandString(str);
	}
}