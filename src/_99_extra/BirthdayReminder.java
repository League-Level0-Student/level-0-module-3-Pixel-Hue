
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 12th";
		String dadsBirthday = "December 10th";
		String myBirthday = "August 23rd";

		// 2. Find out which birthday the user wants and store their response in a variable
	String a = JOptionPane.showInputDialog("Who's birthday would you like to view");
		// 3. Print out what the user typed
	if (a.equals("mom")) {
		
		JOptionPane.showMessageDialog(null, "" + momsBirthday);
	}
	else if (a.contentEquals("dad")) {
		JOptionPane.showMessageDialog(null, "" + dadsBirthday);
	}

	else if (a.contentEquals("mine")) {
		JOptionPane.showMessageDialog(null, "" + myBirthday);
	} 
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
