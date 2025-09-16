import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int c = 2;
		boolean isPrime = true;
		
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
		if(n==1){
			System.out.println("Neither prime nor composite");
		} else {
			while(c*c <= n ){
			if(n % c == 0 ){
				System.out.println("Entered number is not prime");
				isPrime = false;
				break;
			}
			c=c+1;
			
		}
		if(isPrime){
			System.out.println("Entered number is prime");
		}
		}
		
		
	}
}