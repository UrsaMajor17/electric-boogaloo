// BEGENEN: Health Center, Wealth Shop, [Training Area], Pub

import cs1.Keyboard;
public class TownFive extends Town {
    Character chara;
    public TownFive(Character ch){
	chara = ch;
    }

    public void play(){
	System.out.println("You enter the town of THUNTHUNATHUN. Few residents are around, but hopefully you can get on your way.");
	System.out.println("You should probably explore the TAVERN");
	prompt();
    }
    public void prompt(){
	
	String prompt = "Choose your action:\n1 - Explore the town\n2 - Check your inventory\n3 - Go to the tavern\n4 - Go to the pub\n5 - Go to the net zone";
	System.out.println(prompt);
	String input = Keyboard.readString();

	if (input.equals("1")){
	    System.out.println("Under development");
	    prompt();
	}
	if (input.equals("2")){
	    System.out.println("Under development");
	    prompt();
	}
	if (input.equals("3")){
	    System.out.println("Under development");
	    prompt();
	}
	if (input.equals("4")){
	    System.out.println("Under development");
	    prompt();
	}
	if (input.equals("5")){
	    exit();
	}
	else {
	    System.out.println("Try again");
	    prompt();
	}
    }   

   public void exit(){
       System.out.println("You doth had reached the end of the game");
    }
}