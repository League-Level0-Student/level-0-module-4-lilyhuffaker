//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickles=JOptionPane.showInputDialog("Dr. Nugget: How many Nickels wich are a type of coin currency does one aqui- \n Ralph: Get to the point!"
		+ " Dr. Nugget: Right, how many \n nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int cents = Integer.parseInt(Nickles);
		// Ask the user how many dimes they have, and convert their answer
String Dimes=JOptionPane.showInputDialog("Ralph: Make it quick this time! Dr. Nugget: Ok, Ok! How many dimes does thy have? \n there that better!?");
int centstwo = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters = JOptionPane.showInputDialog("Dr. Nugget: How many quarters do you have?");
int centsthree = Integer.parseInt(Quarters);
String Dollars = JOptionPane.showInputDialog("Ralph: I swear you need to say this with nothing extra or facy! Dr.Nugget: Ok Ok, how many dollars do you have?");
int papper = Integer.parseInt(Dollars);
		// Calculate how much money the user has and save it in a double variable 
double total = 0.00;
total+= 0.05*cents;
total+= 0.10*centstwo;
total+= 0.25*centsthree;
total+= 1.00*papper;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "Dr. Nugget: You, in total, in the end, you have, "+total+" money.");
	}
}

