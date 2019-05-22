package optional;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Random;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Instantiate a JFrame object & make it visible
		JFrame jf = new JFrame("Land of turtles");
		jf.setVisible(true);
		// 2. Add the panel to the frame

		jf.add(panel);
		// FlowLayout fl = new FlowLayout();
		// panel.setLayout(fl);

		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Set the size image of the frame to 600 by 400
		jf.setSize(600, 400);
		// 5. Instantiate a Turtle
		Turtle t1 = new Turtle();
		// 6. Add the turtle to the panel
		panel.addTurtle(t1);

		// 7. Put 50 Turtles o n the beach
		Random r = new Random();

		for (int i = 0; i < 50; i++) {

			int x = r.nextInt(500) + 5;
			int y = r.nextInt(300);
			Turtle t = new Turtle();

			t.setX(x);
			t.setY(y);

			panel.addTurtle(t);

		}

	}
}
