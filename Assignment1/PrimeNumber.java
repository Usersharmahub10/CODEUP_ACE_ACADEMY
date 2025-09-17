//This programe returns whether an entered number is prime or not
//class owner : Harshit Sharma
//date : 16-09-2025


import java.util.Scanner;

public class PrimeNumber{
	   
	 static boolean primeNumberOrNot(){
		 Scanner sc = new Scanner(System.in);
		int n;
		while(true){
			System.out.print("Enter the number : ");
			if(sc.hasNextInt()){
				n = sc.nextInt();
				 if(n>0){
					break;
				}
				else{
					System.out.println("Enter positive integer");
		            
				}
			} else{
				System.out.println("Enter a valid integer");
				sc.next();
			}
		}
		 if(n <= 1){
			 System.out.println("Neither prime nor composite");
             return false;			 
		 }
		 
		 boolean isPrime = true;
		 int c = 2;
		 
		 while(c*c <= n){
			 if(n%c==0){
				 isPrime = false;
				 break;
			 }
			 c++;
		 }
		 return isPrime;
	 }
	public static void main(String[] args){
		boolean output = primeNumberOrNot();
		System.out.println(output ? "Entered number is prime" : "Entered number is not prime");
		
		
	}
}