import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static int happinessLevel = 0;	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Pet = JOptionPane.showInputDialog("Dr.Nugget: hello, welcome, what kind of pet would you like?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Dr. Nugget: What would you like to do for your pet?", "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Jog With" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	Cuddle(Pet);
}
if(task==1) {
	Feed(Pet);
}
if(task==2) {
	JogWith(Pet);
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static void Cuddle(String Pet) {
	if(Pet.equals("cat")) {
		JOptionPane.showMessageDialog(null, Pet+" Seems very happy and it purrs.");
		happinessLevel+=2;
	}
	if(Pet.equals("dog")) {
		JOptionPane.showMessageDialog(null, Pet+" Seems very happy and it licks your face.");
		happinessLevel+=4;	
	}
	else{
		JOptionPane.showMessageDialog(null, Pet+" allows the cuddle to happen with no emotion");
		happinessLevel++;
	}
}
static void Feed(String Pet) {
		JOptionPane.showMessageDialog(null, Pet+" Noms food happily");
		happinessLevel+=2;
	}
static void JogWith(String Pet) {
	if(Pet.equals("cat")) {
		JOptionPane.showMessageDialog(null, Pet+" Poutrs on the sidewalk and doesnot move.");
		happinessLevel--;
	}
	if(Pet.equals("dog")) {
		JOptionPane.showMessageDialog(null, Pet+" Seems very happy and it wags its tail the whole time.");
		happinessLevel+=5;
	}
	if(Pet.equals("snake")) {
		JOptionPane.showMessageDialog(null, Pet+"Much happy, very snake.");
		happinessLevel++;
	}
}
}
	
