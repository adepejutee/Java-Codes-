      import javax.swing.JOptionPane;

     public class PaintCalculator {
    	 
     //Adepeju Tugbobo
     // Date 3/4/2023
     // BINS5312 Assignment 5 PaintCalculator
    	 
     public static void main(String[] args) {
      
     // prompt user for room dimensions and ceiling inclusion
    	
     double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the room in feet:"));
     double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the room in feet:"));
     boolean ceilingIncluded = JOptionPane.showConfirmDialog(null, "Is the ceiling included", "Ceiling", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION;
        
      // calculate square footage and gallons of paint needed
        double squareFootage = CalculateFootage(length, width);
        double gallonsNeeded = CalculateGallons(squareFootage, ceilingIncluded);
        
      // calculate paint and labor costs
        double paintCost = CalculatePaintCost(gallonsNeeded);
        double laborCost = CalculateLaborCost(gallonsNeeded);
        
      // display invoice
       String invoice = String.format("Cost of Paint Job:\nCeiling included: %s\nSquare footage: %.2f \nGallons required: %.2f\nPaint cost: $%.2f\nLabor cost: $%.2f\nTotal cost: $%.2f", ceilingIncluded ? "Yes" : "No", squareFootage, gallonsNeeded, paintCost, laborCost, paintCost + laborCost);
        JOptionPane.showMessageDialog(null, invoice, "Invoice", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static double CalculateFootage(double length, double width) 
    
    {
        return 2 * length * width + length * length; 
        // assume four walls and a ceiling
        
    }
    
    public static double CalculateGallons(double squareFootage, boolean ceilingIncluded) 
    {
        return ceilingIncluded ? squareFootage / 380 * 1.25 : squareFootage / 380;
        
    }
        //Paint Cost
    public static double CalculatePaintCost(double gallonsNeeded) 
    
    {
        return gallonsNeeded * 38;
        
    }
    
    //Labour Cost
    public static double CalculateLaborCost(double gallonsNeeded) 
    
    {
        return gallonsNeeded * 6 * 150;
        
    }
}

	

