    import javax.swing.JOptionPane;
    
     public class JobPricing {
        //Adepeju Tugbobo
       // Date 3/4/2023
      // BINS5312 Assignment 5 JobPricing 

      public static void main(String[] args) {
		        
         // Prompt user for job information using JOptionPane
    	   
		  String jobName = JOptionPane.showInputDialog("Enter name of the job");
		   double materialsCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the Cost of Materials"));
		   double workHours = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours of worked "));
		   double travelHours = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours of travelled "));

	    // Compute job estimate
		  double jobEstimate = computeJobEstimate(materialsCost, workHours, travelHours);

		// Compute tax on job estimate
		   double jobCostWithTax = computeTax(jobEstimate);

		 // Compute discount on job cost with tax
		    double discountedJobCost = computeDiscount(jobCostWithTax, materialsCost);

		  // Display job pricing information using JOptionPane
		     String message = "Job Name: " + jobName + "\n"
		      + "Material Cost: $" + String.format("%.2f", materialsCost) + "\n"
		      + "Labour cost: $" + String.format("%.2f", jobEstimate) + "\n"
		      + " Taxes: $" + String.format("%.2f", 0.075 * jobEstimate) + "\n"
		      + "Discount: $" + String.format("%.2f", 0.025 * jobCostWithTax) + "\n"
		      + "Total cost: $" + String.format("%.2f", discountedJobCost);
		        JOptionPane.showMessageDialog(null, message);
		    }

		   public static double computeJobEstimate(double materialsCost, double workHours, double travelHours) 
		    
		   {
		        double jobEstimate = workHours * 35 + travelHours * 12;
		        
		        return jobEstimate;
		   }

		    public static double computeTax(double jobEstimate) 
		    {
		        double taxRate = 0.075;
		        double jobCostWithTax = jobEstimate + (jobEstimate * taxRate);
		        
		        return jobCostWithTax;
		    }

		    public static double computeDiscount(double jobCostWithTax, double materialsCost) 
		    {
		        double discountRate = 0.025;
		        double discountedJobCost = materialsCost + jobCostWithTax * (1 - discountRate);
		        return discountedJobCost;
		   }
		 }

