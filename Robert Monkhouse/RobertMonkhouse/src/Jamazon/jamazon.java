package Jamazon;

import javax.swing.JOptionPane;

public class jamazon {

	public static void main(String[] args) {
		
		int storeNumber, numberOfCopiesSold, minNumber, maxNumber, numbersLeft;
		String storeNumberString, numberOfCopiesSoldString, output;
		
		numbersLeft = 2;
		
		while (numbersLeft >= 0) {
			
			//Ask for the store number.
			storeNumberString = JOptionPane.showInputDialog("Please enter your store number: ");
			
			//Convert from String to integer.
			storeNumber = Integer.parseInt(storeNumberString);	
			
			//Ensure user enters a valid store number (between 100 and 999).
			minNumber = 100;
			maxNumber = 999;
			
			if (storeNumber < minNumber || storeNumber > maxNumber) {
				
			storeNumberString = JOptionPane.showInputDialog("You have entered an invalid store number. Please enter a number between " + minNumber + " and " + maxNumber + ".");

			//Convert from String to integer.
			storeNumber = Integer.parseInt(storeNumberString);
			
			} //Close if statement.
			else {
				
				//Ask for the number of copies sold.
				numberOfCopiesSoldString = JOptionPane.showInputDialog("Please enter the number of copies your store sold: ");
				
				//Convert string to integer.
				numberOfCopiesSold = Integer.parseInt(numberOfCopiesSoldString);
			

		
		
		//Output
		output = "Your store number is " + storeNumber + " and you sold " + numberOfCopiesSold + " copies.";
		
		//Output Window
		JOptionPane.showMessageDialog(null, output, "Jamazon Sales of Jamie Cooks Italy", JOptionPane.INFORMATION_MESSAGE);
		
			} // close else statement
		
		} //close while statement.
		
		

	} //End of public static void main(String[] args)

} //End of public class jamazon
