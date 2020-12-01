package Dice;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lucky_Sixes {	//Start of Assessment Class.

	public static void main(String[] args) {	//Start of main Method.

		String welcome = "For only �1, you have the chance to win:\n\n�1 if you roll one six.\n�40 if you roll two sixes.\n�250 if you roll three sixes.\n�1,500 if you roll four sixes.\n�10,000 if you roll five sixes.\n�50,000 if you roll six sixes!!!";
		JOptionPane.showMessageDialog(null, welcome, "Welcome to Lucky Sixes!", JOptionPane.INFORMATION_MESSAGE);

		String debug = "Would you like to play in 'Debug' mode?";

		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, debug, "Lucky Sixes", dialogButton);

		if(dialogResult == 0) {

			debug();

		} //End of if statement.

		else {

			play();

		} //End of else statement.

	}	//End of main Method.

	public static void debug() { //Start of debug method.

		final int totalPlays = 10;
		int playsLeft = totalPlays;

		while (playsLeft > 0) {

			String debug = "Yes to play (" +playsLeft+ " plays left)\nNo to collate results";

			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, debug, "Lucky Sixes", dialogButton);
			if(dialogResult == 0) {

				String usersName = JOptionPane.showInputDialog("Please enter your name: ");
				String usersAge = JOptionPane.showInputDialog("Please enter your age: ");
				int age = Integer.parseInt(usersAge);

				if (age < 18) {
					JOptionPane.showMessageDialog(null, "Sorry " +usersName+ ", you are too young to play Lucky Sixes. You have to be 18 years old or older");

				} //End of if statement.

				else {	

					String allRolls = " ";
					List<Integer> rolls = new ArrayList<Integer>();

					String results;

					final int totalRolls = 6;
					int rollsLeft = totalRolls;
					int max = 6;
					int min = 1;
					int win1 = 1;
					int win2 = 40;
					int win3 = 250;
					int win4 = 1500;
					int win5 = 10000;
					int win6 = 50000;

					while (rollsLeft > 0) {

						String dice1 = JOptionPane.showInputDialog("please enter a number between 1 and 6 (" +rollsLeft+ " rolls left)");
						int number = Integer.parseInt(dice1);

						if (number > max || number < min) {
							JOptionPane.showMessageDialog(null, "Error. Please enter a valid number");	

						}	//End of if statement.

						else {	
							rollsLeft = rollsLeft - 1;
							allRolls += " " + number + ", ";
							rolls.add(number);

						}	//End of else statement.

					} //End of while loop.

					playsLeft = playsLeft - 1;

					int occurances = Collections.frequency(rolls, 6);

					String prizeWon = "";

					if (occurances == 1){
						prizeWon = "You won " + win1;
					} else if (occurances == 2) {
						prizeWon = "you won " + win2;
					}

					results = "Hi " +usersName+ " , you rolled: " +allRolls + " " + prizeWon;

					JOptionPane.showMessageDialog(null, results, "Results", JOptionPane.INFORMATION_MESSAGE);

				}	//End of else statement.

			}	//End of if statement.

			else {
					
				break;

			}	//End of else statement..

		} //End of while loop.

	} //End of debug method.

	public static void play() {	//Start of play Method.


		final int totalPlays = 10;
		int playsLeft = totalPlays;

		while (playsLeft > 0) {

			String gameOrResults = "Yes to play (" +playsLeft+ " plays left)\nNo to collate results";

			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null, gameOrResults, "Lucky Sixes", dialogButton);

			if(dialogResult == 0) {

				String usersName = JOptionPane.showInputDialog("Please enter your name: ");
				String usersAge = JOptionPane.showInputDialog("Please enter your age: ");
				int age = Integer.parseInt(usersAge);

				if (age < 18) {
					JOptionPane.showMessageDialog(null, "Sorry " +usersName+ ", you are too young to play Lucky Sixes. You have to be 18 years old or older");

				} //End of if statement.

				else {

					final int DICE = 6;
					int[] diceRoll = new int[DICE];

					Random rand = new Random();
					for(int number=0;number<diceRoll.length;++number)
						diceRoll[number] = rand.nextInt(6);

					int[] diceResult = new int[DICE];

					diceResult[0] = diceRoll[0];
					diceResult[DICE-1] = diceRoll[DICE-1];

					String output = "Hi " +usersName+ ", you rolled: ";

					for(int number=0;number<DICE;++number)
						output += diceRoll[number] + ", ";

					JOptionPane.showMessageDialog(null, output);

				}	//End of else statement.

			} //End of if Statement.

			else {
				
			
				JOptionPane.showMessageDialog(null, "Leaderboard");
				break;
			}	//End of else statement..
			
			playsLeft = playsLeft - 1;

		}	//End of While loop.

	}	//End of play Method.
	
	

} //End of Lucky Sixes Class.	
