package loan;
import loan.EMI;
import java.util.*;

public class Loan {
	
	public static void main(String[] args) {
		
		//Enable the commented lines for manual user input via standard I/O.
		
		//Scanner scan = new Scanner(System.in);
		int principalAmt = Integer.parseInt(args[0]);
		//int principalAmt = scan.nextInt();
		
		int numOfEMI = Integer.parseInt(args[1]);
		
		//int numOfEMI = scan.nextInt();
		
		//Principal Amoount less than 1 is considered as invalid
		if(principalAmt < 1) {
			System.out.println("Please enter the valid principal amount.");
		}
		//numOfEMI should be >= 1
		else if(numOfEMI < 1) {
			System.out.println("Please enter the valid number of EMIs.");
		}else {
			EMI emi = new EMI(principalAmt, numOfEMI);
			emi.showDetails();
		}
	}
}
