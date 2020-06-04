package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String An = JOptionPane.showInputDialog("Are you happy?");
		if (An.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever Your Doing!");
		}
		if (An.equals("No")) {
			String An1 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (An1.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something!");
			}
			if (An1.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever Your Doing!");
			}
		}

	}
}
