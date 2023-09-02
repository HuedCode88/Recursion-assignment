package handshake;
import java.util.InputMismatchException;
import java.util.Scanner;


public class main {

	
	public static int handshake(int i){
		
		if(i==0) {
			return i;
		}
		else {
		return handshake(i-1)+(i-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an amount of people.");
		
		try{
			int i= scan.nextInt();
				
				if(i<0) {
					throw new InputException("Please Enter a positive amount of people.");
				}
				System.out.println(handshake(i));
		}
		catch(InputMismatchException e){
			System.out.println("Please input an amount of people.");
		}
		catch(InputException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
