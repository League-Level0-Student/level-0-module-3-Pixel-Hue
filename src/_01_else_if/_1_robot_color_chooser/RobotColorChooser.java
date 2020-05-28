
package _01_else_if._1_robot_color_chooser;

import javax.swing.Box.Filler;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Random asd = new Random();
		Robot qwe = new Robot("mini");
		qwe.penDown();
		qwe.setSpeed(100);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for (int e = 0; e < 99; e++) {
			int ran = asd.nextInt(255);
			int ran3 = asd.nextInt(255);
			int ran4 = asd.nextInt(255);

			for (int i = 0; i < 89; i++) {
				qwe.move(4);
				qwe.turn(4);
			}

			// 3. Set the pen width to 10
			qwe.setPenWidth(10);
			// 4. Ask the user what color pen they would like the robot to draw with
			String color = JOptionPane.showInputDialog("What color would you like me to draw?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("red")) {
				qwe.setPenColor(255, 0, 0);
			} else if (color.equals("blue")) {
				qwe.setPenColor(0, 0, 255);
			} else if (color.equals("green")) {
				qwe.setPenColor(0, 255, 0);
			} else if (color.equals("yellow")) {
				qwe.setPenColor(255, 255, 0);
			} else if (color.equals("turquoise")) {
				qwe.setPenColor(0, 255, 255);
			} else if (color.equals("magenta")) {
				qwe.setPenColor(255, 0, 255);
			} else {
				qwe.setPenColor(ran, ran3, ran4);
			}
			// 6. If the user doesn't enter anything, choose a random color
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

		}
	}

}
