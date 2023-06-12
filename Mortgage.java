
public class Mortgage {
	
	//Adepeju Tugbobo
    // Date 4/18/2023
    // BINS5312 Final term Project

	//Declaring variables 

	String loanID;
    double loanAmount;
    String borrowerFirstName;
    String borrowerLastName;
    double homeSquareFootage;
    double homeMarketPrice;

    public Mortgage(String loanID, double loanAmount, String borrowerFirstName, String borrowerLastName,
    double homeSquareFootage, double homeMarketPrice) {

    this.loanID = loanID;
    this.loanAmount = loanAmount;
    this.borrowerFirstName = borrowerFirstName;
    this.borrowerLastName = borrowerLastName;
    this.homeSquareFootage = homeSquareFootage;
    this.homeMarketPrice = homeMarketPrice;
    }

	public String toString()

    {
    return "Mortgage [loanID=" + loanID + ", loanAmount=" + loanAmount + ", borrowerFirstName=" + borrowerFirstName
                         + ", borrowerLastName=" + borrowerLastName + ", homeSquareFootage=" + homeSquareFootage
                         + ", homeMarketPrice=" + homeMarketPrice + "]";
    }

     // Declaring the Get and Set methods
      public String getLoanID() {
       return loanID;
       }
        public void setLoanID(String loanID) {
        this.loanID = loanID;
        }
        public double getLoanAmount() {
        return loanAmount;
        }
        public void setLoanAmount(double loanAmount) 
        {
     	this.loanAmount = loanAmount;
         }
      public String getBorrowerFirstName() 
      {
       return borrowerFirstName;
       }
       public void setBorrowerFirstName(String borrowerFirstName) 
       {
    	this.borrowerFirstName = borrowerFirstName;
       }
       public String getBorrowerLastName() 
       {
        return borrowerLastName;
       }
       public void setBorrowerLastName(String borrowerLastName) 
       {
       this.borrowerLastName = borrowerLastName;
       }

       public double getHomeSquareFootage() 
       {
         return homeSquareFootage;

        }

           public void setHomeSquareFootage(double homeSquareFootage) 
           {
        this.homeSquareFootage = homeSquareFootage;
         }
        public double getHomeMarketPrice() 
        {
          return homeMarketPrice;
         }
        public void setHomeMarketPrice(double homeMarketPrice) 
        {
           this.homeMarketPrice = homeMarketPrice;
           }

       public double calculateOverAmount() 
       {
    	   if (loanAmount - homeMarketPrice < 0){
    		   return 0.00;
    	   }
          return loanAmount - homeMarketPrice;

       }

        public boolean isUnderWater() 
        {
          return calculateOverAmount() > 0;

         }
		}



