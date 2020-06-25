
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String ans1 = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
				if (ans1.equals("yes")) {
					String ans2 = JOptionPane.showInputDialog("Ok, What is your favorite hobby?");
					JOptionPane.showMessageDialog(null, ans2 + " is much better with bananas!");
				}
				else if (ans1.contentEquals("no")) {
					JOptionPane.showMessageDialog(null, "Your crazy!");
				}
				else {
					JOptionPane.showMessageDialog(null, "You're bananas!?");
				}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
