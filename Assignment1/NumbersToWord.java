//This programe converts number to words
//class owner : Harshit Sharma
//date : 16-09-2025

import java.util.*;
public class NumbersToWord{
	
	static void numToWord(int num){
		String ans = "";
		String[] unitdigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
        "eighteen", "nineteen"};
		
		String[] tensdigit = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		if(num>=100){
			ans = ans + unitdigit[num/100] + " hundred";
			num = num % 100;
			
			if(num>0){
			ans = ans + " and ";
		  }
		}
		if(num>= 20){
			ans = ans + tensdigit[num/10];
			num = num % 10;
			if(num> 0){
			ans = ans + unitdigit[num%10] + " ";
		    }
		}
		else if(num>0){
			ans = ans + unitdigit[num]+ " ";
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args){
		int n;
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		while(true){
			if(sc.hasNextInt()){
				n = sc.nextInt();
				if(n>0 && n<1000){
					break;
				} else{
					System.out.println("Number out of range i.e. from 1-1000");
				}
			} else{
				System.out.println("Enter a valid integer");
			}
		}
		numToWord(n);
		
		
	}
}