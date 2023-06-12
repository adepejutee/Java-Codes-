
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.util.Arrays;

		import javax.swing.JOptionPane;
		import java.io.BufferedReader;


		public class searchMortgage {
			//Adepeju Tugbobo
		    // Date 4/18/2023
		    // BINS5312 Final term Project

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog(null,
		"Enter 1 to run default load report \n or 2 to search for loan information");

		if (input.equals("1")) {
		runDefaultLoanReport();
		} else if (input.equals("2")) {
		searchLoanInformation();
		}
		}

		private static void runDefaultLoanReport() {

		try

		{
		FileWriter fw = new FileWriter("default.txt");

		FileReader fr = new FileReader("loans.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {

		String[] arr = line.split(",");

		if (arr[5].equals("Default")) {
		String arrStr = Arrays.toString(arr);

		System.out.println(arrStr);

		for (int i = 0; i < arr.length; i++) {
		String str = arr[i];
		if (i != 0)
		fw.write(",");
		fw.write(str);

		}
		fw.write("\n");
		}

		}
		fw.close();
		br.close();

		} catch (Exception e) {

		}

		}

		private static void searchLoanInformation() {
		String loanID = JOptionPane.showInputDialog(null, "Enter LoanID to search");
		String[] loan = finder(loanID, "loans.txt");
		if (loan.length == 0) {
		JOptionPane.showMessageDialog(null, "Invalid Mortgage ID");
		return;
		}
		String[] borrower = finder(loan[1], "borrowers.txt");
		

		Mortgage mortgage = new Mortgage(loan[0], Double.parseDouble(loan[2]), borrower[1], borrower[2],
		Double.parseDouble(loan[4]), Double.parseDouble(loan[3]));

		// printing out necessary informations
		System.out.println("***** Mortgage Information Search Results *****");
		System.out.println("MortgageID = "+mortgage.getLoanID());
		System.out.println("LoanAmount = $" + mortgage.getLoanAmount());
		System.out.println("Borrower Name = "+mortgage.getBorrowerFirstName() + " " + mortgage.getBorrowerLastName());
		System.out.println("Home Size = "+mortgage.getHomeSquareFootage() + " SQFT");
		System.out.println("Home Value = $"+mortgage.getHomeMarketPrice());
		System.out.println("Over Value Amount = $"+mortgage.calculateOverAmount());
		


		//introducing if/else statement for is under water
		if (mortgage.isUnderWater()) {
		System.out.println("Your Loan is Underwater" + "\n" +  "Loan Amount is more than home value");

		}else {
		System.out.println("There is equity in the home loan");

		}

		}

		private static String[] finder(String loanId, String file) {
		return finder(loanId, file, 0);

		}

		private static String[] finder(String id, String file, int index) {
		try

		{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {

		String[] arr = line.split(",");

		if (arr[index].equals(id))
		return arr;

		}

		br.close();

		} catch (Exception e) {

		}

		return new String[] {};

		}

		}


