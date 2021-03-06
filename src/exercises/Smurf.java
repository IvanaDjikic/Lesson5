package exercises;

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (this.name.equals ("Papa")) {
			return "I wear a red hat.";	
		}
		else {
			return "I wear a white hat.";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (this.name.equals ("Smurfette")) {
			return "I am a girl.";	
		}
		else {
			return "I am a boy.";
		}
	
	}
	
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("Handy");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		
		Smurf papaSmurf = new Smurf("Papa");
		System.out.println(papaSmurf.getName()+ " " + papaSmurf.getHatColor() + " " + papaSmurf.isGirlOrBoy());
		
		Smurf smurfetteSmurf = new Smurf("Smurfette");
		System.out.println(smurfetteSmurf.getName()+ " " + smurfetteSmurf.getHatColor() + " " + smurfetteSmurf.isGirlOrBoy());
	}

}



