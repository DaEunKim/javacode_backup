package Classhw11;
//**********************************************************
//Player.java
//
//Defines a Player class that holds information about an athlete.
//**********************************************************

import java.util.*;

public class Player
{
 private String name;
 private String team;
 private int jerseyNumber;
 private Scanner in = new Scanner(System.in);

 //-----------------------------------------------------------
 // Prompts for and reads in the player's name, team, and 
 // jersey number.
 //-----------------------------------------------------------

 public void readPlayer()
 {
	System.out.print("Name: ");
	name = in.next();
	System.out.print("Team: ");
	team = in.next();
	System.out.print("Jersey number: ");
	jerseyNumber = in.nextInt();
 }

}
