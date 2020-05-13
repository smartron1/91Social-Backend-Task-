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
		
		EMI emi = new EMI(principalAmt, numOfEMI);
		emi.showDetails();
	}
}
