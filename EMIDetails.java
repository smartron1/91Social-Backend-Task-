package loan;
import java.time.*;
import java.util.*;

public class EMIDetails {
	
	//Variables with basic details of each EMI
	int emiNo; 
	float principalEMI, interestEMI;
	float principalRem;
	LocalDate dateOfEMI;
	
	
	public EMIDetails(int emiNo, float principalEMI, float interestEMI, float principalRem, LocalDate date) {
		this.dateOfEMI = date;
		this.emiNo = emiNo+1;
		this.principalEMI = principalEMI;
		this.interestEMI = interestEMI;
		this.principalRem = principalRem - (interestEMI+principalEMI);
	}
	
	//Separate show method to print the variables.
	public void show() {
		
		System.out.println(emiNo+". EMI No : "+this.emiNo+", Principal EMI : "+this.principalEMI
							+", Interest EMI = "+this.interestEMI+", Total EMI = "
				+(this.principalEMI+this.interestEMI)+", EMI Date = "+this.dateOfEMI+", "
						+ "Principal remaining : "+this.principalRem);
		
	}

}
