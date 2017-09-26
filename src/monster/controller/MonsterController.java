package monster.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController
{

	private MonsterDisplay popup;

	
	//Constructor, initialize the data member popup
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}

	//When called initialize donny as a monster and start the interactWithMonster method
	public void start()
	{
		
		/*int count = 0;
		while(count < 10)
		{
			popup.displayText("Am i not the coolest?!");
			count += 5;
		}*/
		
		/*for(int loop = 0; loop < 10; loop += 1) {
			popup.displayText("HI MONKEY DOGERONI " + loop);
		}*/
		
		
		
		
		MarshmallowMonster donny = new MarshmallowMonster("Donny", 1, 8, 2, true);
		popup.displayText(donny.toString());

		interactWithMonster(donny);

	}

	private void interactWithMonster(MarshmallowMonster monster)
	{

		//create data member consumed
		int consumed = 0;
		//get response 
		String response = popup.getResponse(monster.getName() + " wants to know how many eyes you want to eat. How many you want to eat?");
		//check if response is valid
		
		while(!isValidInteger(response)) {
			popup.displayText("grr type in a better answer next time");
			response = popup.getResponse("Type in an integer value!");
		}

		consumed = Integer.parseInt(response);
		
		//Change eye count based on what user inputted
		monster.setEyeCount(monster.getEyeCount() - consumed);
		//Display the description from the toString method
		popup.displayText(monster.toString());

		//Set arm count
		monster.setArmCount(1000000);
		//display description from the toString method
		popup.displayText(monster.toString());

		//data member armEat
		int armEat = 0;
		//Get user input
		response = popup.getResponse("How many arms are you interested in eating? I have " + monster.getArmCount());
		//check if valid
		while (!isValidInteger(response))
		{
			//set if valid
			popup.displayText("grr type in a better answer next time");
			response = popup.getResponse("Type in an integer value!");
			
		}
		
		armEat = Integer.parseInt(response);
		
		
		if (armEat == 0)
		{
			//armEat equals 0 so show text
			popup.displayText("Not hungry? So sad.....");
		}
		else if (armEat < 0 || armEat > monster.getArmCount())
		{
			//armEat is less then 0, or armEat is bigger then arm count or monster
			popup.displayText("Invalid sorry matey. YOU CANT DO THIS...<><><><><><><ååååfthrhreh><><å><><><><><><>å<aaaaaaaaaaaaae0><bbbbbbbbbbn><><><å><><>åå");
		}
		else
		{
			//if it all works out set arm count
			monster.setArmCount(monster.getArmCount() - armEat);
			popup.displayText("Okay, now I have this many arms " + monster.getArmCount());

		}
		//display text
		popup.displayText("I grew 10000 eyes");
		monster.setEyeCount(monster.getEyeCount() + 10000);
		//eyeEat created
		int eyeEat = 0;
		//get response
		response = popup.getResponse("How many eyes you want to eat?");
		while (!isValidInteger(response))
		{
			//set if valid
			popup.displayText("grr type in a better answer next time");
			response = popup.getResponse("Type in an integer value!");
			
		}
		
		eyeEat = Integer.parseInt(response);
		
		if (eyeEat == 0)
		{
			//eatEat equals 0
			popup.displayText("EATT MEEEE");
		}
		else if (eyeEat > monster.getEyeCount() || eyeEat < 0)
		{
			
			popup.displayText("I dont have that many eyes");
		}
		else
		{
			//Ate eyes so subtract from eyecount
			monster.setEyeCount(monster.getEyeCount() - eyeEat);
			popup.displayText("You ate some eyes");
		}
		//eatTentacles data member
		double eatTentacles = 0;
		//get response
		response = popup.getResponse("How many tentacles do you want to eat? I have " + monster.getTentacleAmount());
		while (!isValidDouble(response))
		{
			//eatTentacles change if valid
			popup.displayText("grr type in a better answer next time");
			response = popup.getResponse("Type in a double value!");
		}
		
		eatTentacles = Double.parseDouble(response);
		
		//Based on response display a text
		if (eatTentacles == monster.getTentacleAmount())
		{
			popup.displayText("You ate all my tentacles");
		}
		else
		{
			popup.displayText("More likely");
		}
		//isBoolean dataMember
		boolean isBoolean = false;
		response = popup.getResponse("true or false?");
		//If valid change
		while(!isValidBoolean(response)) {
			popup.displayText("grr type in a better answer next time");
			response = popup.getResponse("Type in a boolean value!");
		}
		
		isBoolean = Boolean.parseBoolean(response);
		
		popup.displayText("Cool");

	}

	// Helper methods all of these check if a certain value is valid
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("You need to input an int " + sample + " is not an int");
		}
		return valid;
	}

	private boolean isValidDouble(String sample)
	{
		boolean valid = false;
		try
		{
			Double.parseDouble(sample);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("You need to input an double - " + sample + " is not an double");
		}
		return valid;
	}

	private boolean isValidBoolean(String sample)
	{
		boolean valid = false;
		try
		{
			Boolean.parseBoolean(sample);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("You need to input a boolean - " + sample + " this is not a boolean");
		}
		return valid;
	}

}
