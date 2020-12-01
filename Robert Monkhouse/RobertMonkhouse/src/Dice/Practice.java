package Dice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {	//Start of Assessment Class.

	public static void main(String[] args) {	//Start of main Method.
		
		play();
		
	}
		
		
		
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
						int[] dice1 = new int[DICE];

						Random rand = new Random();
						for(int number=0;number<dice1.length;++number)
							dice1[number] = rand.nextInt(6);

						int[] diceResult = new int[DICE];

						diceResult[0] = dice1[0];
						diceResult[DICE-1] = dice1[DICE-1];

						String output = "Hi " +usersName+ ", you rolled: ";

						for(int number=0;number<DICE;++number)
							output += dice1[number] + ", ";

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
		
	}