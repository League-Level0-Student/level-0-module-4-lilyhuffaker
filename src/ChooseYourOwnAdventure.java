import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	ChooseDoor();

}
public static void ChooseDoor() { 
	JOptionPane.showMessageDialog(null, "Unknown: Hello weary traveler.I know you are confused but you must act fast...");
	JOptionPane.showMessageDialog(null, "You: Wha- where am I? Who are you?");
	JOptionPane.showMessageDialog(null, "Unknown: I cannot tell you now who I am. But you are in an alternate universe, \n and it is broken"
			+ "You are the only one to fix it and there is no time...");
	JOptionPane.showMessageDialog(null, "You: How do I fix it?");
	JOptionPane.showMessageDialog(null, "Unkown: Find the ########## and ask it to ##### for the world to be fixed. But remember, don't #######...");
	int n = JOptionPane.showOptionDialog(null, "Game: There are four doors infront of you \n wich do you choose?" , "Doot", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null, 
			new Object[] {"A Solid Black door all the way to the left","A Pure White door emitting a familier smell","A Green Door that has a sour smell","A Yellow door that is yellow"}, null);
	//system.out.println(n);
	
	if(n ==0) {
	DoorOne();	
	}
	if(n ==1) {
	DoorTwo();	
	}
	if(n ==2) {
	DoorThree();	
	}
	if(n ==3) {
	DoorFour();	
	}
	
 }
public static void DoorOne() {
	JOptionPane.showMessageDialog(null, "Game: as the door opens, you are standing in an all white tunnel the end so far that you cannot see past it. ");
	JOptionPane.showMessageDialog(null, "Unknown: Be careful traveler, we do not know what lies at the end of this tunnel...");
	WhiteTunnel();
}
public static void DoorTwo() {
	JOptionPane.showMessageDialog(null, "Game: As you open the door you are bathed in the smell of home. As you walk further in distant memories begin to enchant your mind. \n"
			+ "Childhood glee and cocoa on christmas eve. you walk further in, the door shuts, but you dont care. You are home.");
	JOptionPane.showMessageDialog(null, "Unknown: No, you must fight it! ######## Sto-##### You must##########!!!...");
}
public static void DoorThree() {
	JOptionPane.showMessageDialog(null, "Game: As you walk into the third door you come into a jungle like area, the smell like before clouding your eyes and nose. \n"
			+ "Your eyes start to water but you push on.");
	JOptionPane.showMessageDialog(null, "Unknown, good choice. You are a few steps closer to your goal. I knew you can do this. now make sure you make the right turn when you arrive at the crossroads");
	
}
public static void DoorFour() {
	JOptionPane.showMessageDialog(null, "Game: As you step inside the Yellow Door, you stand on a ledge peering down into a pit with no end. As you try to turn back, \n"
			+ "a hand pushes you in and you fall to your death." );
	JOptionPane.showMessageDialog(null, "Unknown: You fool, now we are all doomed. ####### ###### ####...");
}
public static void AcidForest() {
	//what happens after door three
	JOptionPane.showMessageDialog(null, "game: Walking futher still, the air get herder to breathe in and the forest is getting so dense that you constantly trip over roots.");
	int a = JOptionPane.showOptionDialog(null, "Game: You finally come across a cross roads. Where do you go?" , "Doot", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null, 
			new Object[] {"The Left, no end is seen","The Right, a strange pile of rocks lie ahead"}, null);
	//system.out.println(a);
	if (a == 0) {
		JOptionPane.showMessageDialog(null, "Game: You continue to the left when you suddenly stop in your tracks.");
		JOptionPane.showMessageDialog(null, "Game: You stand perfectly still as a large snake wraps around your throat. \n tighter and tighter until the work goes balck.");
		JOptionPane.showMessageDialog(null, "Unknown: No! You can't, we are all doomed!!! ###########...");
	}
	if (a == 1) {
		JOptionPane.showMessageDialog(null, "Game:You head twards the rocks when the ground begins to rumble... ");
		JOptionPane.showMessageDialog(null, "Game: Bolders rain down upon your head killing you in an instant...");
		JOptionPane.showMessageDialog(null, "Unknown: ############ 3542 ### @!# $$# F#ERW  #$@#$REWF...");
	}
}
public static void WhiteTunnel() {
	//What happpens after door one
	JOptionPane.showMessageDialog(null, "Game: #############");
}
}

