package loan;
import java.text.SimpleDateFormat;  
import java.util.*;
import java.time.*;
import loan.EMIDetails;


//EMI Class to create instance of EMI Disbursement
public class EMI {
	
	static float interest = 1;
	float principalAmt;
	LocalDate dateOfCreation = LocalDate.now();
    int numOfEMI;
    float totalAmt;
    
    //ArrayList contains details of the EMI (EMIDetails) object
    List<EMIDetails> emiDetails = new ArrayList<>();
    
    
    
	public EMI(float principalAmt, int numOfEMI) {
		this.principalAmt = principalAmt;
		this.numOfEMI = numOfEMI;
		calculateEMI();
	}
	
	void calculateEMI() {
		
		float principalEMI = principalAmt/numOfEMI;
		float interestEMI = principalAmt*(interest/100);
		totalAmt = principalAmt + interestEMI*numOfEMI;
		
		for (int j = 0; j<numOfEMI; j++) {
			if(emiDetails.size() == 0) {
				emiDetails.add(new EMIDetails(emiDetails.size(), principalEMI, interestEMI, totalAmt, dateOfCreation.plusMonths(j+1)));
			}else {
					emiDetails.add(new EMIDetails(emiDetails.size(), principalEMI, interestEMI, emiDetails.get(emiDetails.size()-1).principalRem, dateOfCreation.plusMonths(j+1)));
			}
		}
		
	}
	
	void showDetails() {
		System.out.println("1. Loan creation date : "+dateOfCreation
							+"\n2. Principal Amount : "+principalAmt
							+"\n3. No of EMI's : "+numOfEMI
							+"\n4. Total payable amount : "+principalAmt
							+" (Principal) + "+principalAmt*(interest/100)*numOfEMI+" (Interest for "+numOfEMI+" months) = "+totalAmt
							+"\n5. EMI Details : ");
		
		for(int i = 0; i<emiDetails.size(); i++) {
			emiDetails.get(i).show();
			
		}
	}

}
