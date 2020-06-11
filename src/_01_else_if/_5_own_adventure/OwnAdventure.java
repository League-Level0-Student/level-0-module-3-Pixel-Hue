package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String PathDecision1 = JOptionPane.showInputDialog(
				"You have a job, go eat breakfast and leave to go to\nwork early(a) or sleep in and hope you don't sleep through your\nalarm clock. Type a or b");
		if (PathDecision1.equals("a")) {
			JOptionPane.showMessageDialog(null, "You have arrived at work!");
			String Path2 = JOptionPane.showInputDialog(
					"You arrived at work 10 minutes early, but you are starting to get hungry.\n You know there is a starbucks nearby go to starbucks(a) or stay and wait(b).");
			if (Path2.equals("a")) {
				JOptionPane.showMessageDialog(null,
						"You got to the starbucks got food and was able to get back in time and you weren't hungry for the rest of work!");
			} else if (Path2.equals("b")) {
				JOptionPane.showMessageDialog(null, "You are really hungry now.");
				String Path4 = JOptionPane
						.showInputDialog("You are getting really really hungry ask boss for break yes(a) or no(b)");
				if (Path4.equals("a")) {
					JOptionPane.showMessageDialog(null,
							"Congrats the boss said yes and you were \nnot hungry for the rest of work");
				} else {
					JOptionPane.showMessageDialog(null, "You were hungry for the rest of work :(");
				}
			}
		} else if (PathDecision1.equals("b")) {
			JOptionPane.showMessageDialog(null,
					"You wake up, but wait you are late for work! You get ready and head to work quick\n to bad your not gonna get full pay today now. :(");
			String PathDec3 = JOptionPane.showInputDialog(
					"You are at work, you work for a fast food restraunt, will you take order 68(a) or will you take order 49(b).");
			if (PathDec3.equals("a")) {
			JOptionPane.showMessageDialog(null, "You got tipped 50% :D Yay!");
			} else if (PathDec3.equals("b")) {
			JOptionPane.showMessageDialog(null, "You got tipped 30% :D Yay!");
			}
		}
	}
}
