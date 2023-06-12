
    import java.util.Random;

     import javax.swing.JOptionPane;

     public class BinsCasino {
		    	
		//Adepeju Tugbobo
	    // Date 2/25/2023
    	// BINS5312 BinsCasino Exam 
		     
	  public static void main(String[] args) {

	  // Declare Variable 
	  // Prompt the player to select 1 die or 2 dice play
	 int numDice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to Play with 1 Die,\n Enter 2 to Play with 2 Dice:"));

	 // Prompt the user for the amount he wants to bet
	 int betAmount = Integer.parseInt(JOptionPane.showInputDialog("How much money do you want to play:"));

	 // Roll the dice
	  Random rand = new Random();
	  int dice1 = rand.nextInt(6) + 1;
	  int dice2 = 0;
	  int sum = 0;
	  String message = "";
	  if (numDice == 2) 
	  {
	   dice2 = rand.nextInt(6) + 1;
	   sum = dice1 + dice2;
	   }

		 // Determine the outcome of the bet
		 int payout = 0;
		if (numDice == 1){
		 message = "You rolled a " + dice1 + "\n";
		 if (dice1 <= 3) {
		  payout = 0;
		  message += "Sorry! you lost all your $"  + betAmount +   " bet";
		  } 
		else if (dice1 == 4) {
	    payout = betAmount;
		 message += "You get back your bet of  $" + payout;
		 } 
		 else if (dice1 == 5) {
		 payout = betAmount / 2;
		 message += "You back half your bet $" + payout;
		 } 
		 else if (dice1 == 6) {
		  payout = betAmount * 2;
		  message += "Your bet is doubled $" + payout;
		 }
		 } 
				  
		 else if (numDice == 2) {
	     message = "You rolled a " + dice1 + " and a " + dice2 + "\n";
		 if (sum == 2 || sum == 4 || sum == 10 || sum == 12) {
	    payout = betAmount * 2;
	    message += "Your bet is doubled $" + payout;
	    } 
		else if (sum == 6) 
	    {
		 payout = betAmount * 3;
		 message += "Your bet is tripled $" + payout;
	    }
		else 
	    {
		payout = 0;
		 message += "Sorry! you lost all your $"  + betAmount +   " bet";
	    }
	    }
		JOptionPane.showMessageDialog(null, message);
				        

		}
		 }
