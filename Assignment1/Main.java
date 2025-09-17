import java.util.Scanner;

public class Main{
	
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
		System.out.print("Enter the Option which you want to run : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nexInt();
		
		switch(n){
			case 1 : 
			     
		}
		
	}
	
}