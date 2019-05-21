package exercises;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug1 = new Bug();
		Location l1 = new Location(2, 2);
		world.add(l1, bug1);
		Bug bug2 = new Bug();
		Random r = new Random();
		int x = r.nextInt(10);
		int y = r.nextInt(8) + 1;
		Location l2 = new Location(x, y);
		world.add(l2, bug2);
		bug2.setColor(Color.BLUE);
		for (int i = 0; i < 2; i++) {
			bug2.turn();
		}

		Flower f1 = new Flower();

		world.add(new Location(2, 1), f1);
		world.add(new Location(2, 3), f1);
		world.add(new Location(x, y - 1), f1);
		world.add(new Location(x, y + 1), f1);

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if ((i != 2 || j != 2) && (i != x || j != y)) {
					world.add(new Location(i, j), new Flower(Color.MAGENTA));
				}

			}

		}

	}

}
