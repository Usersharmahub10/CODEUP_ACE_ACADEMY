//This method prints the table of a number input bu User , you can also decide the range of the table
//Class owner : Harshit Sharma
//Date : 15-09-2025

import java.util.Scanner; 

public class PrintTable{ //function is static because non-static function cannot be referenced from static function i.e. main
	public static void printTableOfN(int n ,int range){ //Parameters
		for(int i = 1 ; i <= range ; i++){
			System.out.println(n + " " + "*" + i + " " + "=" + n*i);
		}
	}
	public static void main(String[] args){ 
	
	    int n , range;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Enter the number : ");
			if(sc.hasNextInt()){
				n = sc.nextInt();
				 if(n>0){
					 break;
				 } else{
					 System.out.println("Enter Positive Integer ");
				 }
			} else {
				System.out.println("You have entered a invalid input , enter integer");
				sc.next();
			}
		}
		
		while(true){
			System.out.print("Enter the range from where you want to extend your table : ");
			if(sc.hasNextInt()){
				range = sc.nextInt();
				if(range>0){
					break;
				} else{
					System.out.println("Enter Positive Range ");
				}
			} else {
				System.out.println("You have entered a invalid range , enter integer");
				sc.next();23
			}
		}
		printTableOfN(n , range);
	}
}