    import javax.swing.JOptionPane;

    public class PayRoll {
	 //Adepeju Tugbobo
     // Date 2/25/2023
	 // BINS5312 PayRoll Exam

	public static void main(String[] args) {
		
	//prompt the user to select employee type
	int employeeType = JOptionPane.showConfirmDialog(null, "Are you a Manager?", "Confirmation",
				JOptionPane.YES_NO_OPTION);
	
	 //prompt user to enter hours worked 
	 String input1 = JOptionPane.showInputDialog("Enter total hours worked for the week");
	 int reghours, overtimeHours;
	 int hoursWorked = Integer.parseInt(input1);
	 if (hoursWorked >= 40) {
			reghours = 40;
			overtimeHours = hoursWorked - 40;
	 } else 
	 {
		reghours = hoursWorked;
		overtimeHours = 0;
		}
	
		double hourlyRate, overtimeRate;
		int YES = 0;
		if (employeeType == YES) {
		
			hourlyRate = 25.00;
			overtimeRate = 37.50;
		} else {
			
			hourlyRate = 16.00;
			overtimeRate = 24.00;
		}
		double grossPay;
		if (hoursWorked > 40) {
			grossPay = (40 * hourlyRate) + (hoursWorked - 40) * overtimeRate;
		} else {
			grossPay = hoursWorked * hourlyRate;
		}
		
		//calculate deduction from gross pay
		double incomeTax = 0.26 * grossPay;
		double socialSecurity = 0.04 * grossPay;
		double unemploymentInsurance = 0.01 * grossPay;
		double retirementBenefits = 0.05 * grossPay;
		double healthInsurance = 0.01 * grossPay;
		double totalDeductions = incomeTax + socialSecurity + unemploymentInsurance + retirementBenefits
				+ healthInsurance;
		
		// calculate net pay
		double netPay = grossPay - totalDeductions;
		
		// display results to user
		System.out.println(" Regular Hours = " + reghours);
		System.out.println(" Overtime Hours = " + overtimeHours);
		System.out.println(" Gross pay = $" + grossPay);
		System.out.println(" ");
		System.out.println("********Deductions********");
		System.out.println(" ");
		System.out.println(" Social security= $" + socialSecurity);
		System.out.println(" Unemployment Ins= $" + unemploymentInsurance);
		System.out.println(" Retirement Benefits = $" + retirementBenefits);
		System.out.println(" Health insurance = $" + healthInsurance);
		System.out.println(" Taxes = $" + incomeTax);
		System.out.println(" ");
		System.out.println("********************");
		System.out.println(" ");
		System.out.println(" Net pay: $" + netPay);
	}
}
