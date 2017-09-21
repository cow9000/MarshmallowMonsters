package monster.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

public class MonsterController
{
	
	private MonsterDisplay popup;
	
	public MonsterController() {
		popup = new MonsterDisplay();
	}
	
	
	public void start()
	{
		// MarshmallowMonster monster = new MarshmallowMonster();
		// popup.displayText(monster);

		MarshmallowMonster donny = new MarshmallowMonster("Donny", 1, 8, 2, true);
		popup.displayText(donny.toString());

		interactWithMonster(donny);

	}

	private void interactWithMonster(MarshmallowMonster monster)
	{
		
		int consumed = 0;
		String response = popup.getResponse(monster.getName() + " wants to know how many eyes you want to eat. How many you want to eat?");
		if(isValidInteger(response)) {
			consumed = Integer.parseInt(response);
		}

		monster.setEyeCount(monster.getEyeCount() - consumed);
		popup.displayText(monster.toString());

		monster.setArmCount(1000000);
		popup.displayText(monster.toString());

		int armEat = 0;
		response = popup.getResponse("How many arms are you interested in eating? I have " + monster.getArmCount());
		if(isValidInteger(response)) {
			armEat = Integer.parseInt(response);
		}
		
		if (armEat == 0)
		{
			popup.displayText("Not hungry? So sad.....");
		}
		else if (armEat < 0 || armEat > monster.getArmCount())
		{
			popup.displayText("Invalid sorry matey. YOU CANT DO THIS...<><><><><><><ååååfthrhreh><><å><><><><><><>å<aaaaaaaaaaaaae0><bbbbbbbbbbn><><><å><><>åå");
		}
		else
		{

			monster.setArmCount(monster.getArmCount() - armEat);
			popup.displayText("Okay, now I have this many arms " + monster.getArmCount());

		}
		popup.displayText("I grew 10000 eyes");
		monster.setEyeCount(monster.getEyeCount() + 10000);

		int eyeEat = 0;
		response = popup.getResponse("How many eyes you want to eat?");
		if(isValidInteger(response)) {
			eyeEat = Integer.parseInt(response);
		}
		if (eyeEat == 0)
		{
			popup.displayText("EATT MEEEE");
		}
		else if (eyeEat > monster.getEyeCount() || eyeEat < 0)
		{
			popup.displayText("I dont have that many eyes");
		}
		else
		{
			monster.setEyeCount(monster.getEyeCount() - eyeEat);
			popup.displayText("You ate some eyes");
		}

		double eatTentacles = 0;
		response = popup.getResponse("How many tentacles do you want to eat? I have " + monster.getTentacleAmount());
		if(isValidDouble(response)) {
			eatTentacles = Double.parseDouble(response);
		}
		
		if (eatTentacles == monster.getTentacleAmount())
		{
			popup.displayText("You ate all my tentacles");
		}
		else
		{
			popup.displayText("More likely");
		}
		
		
	}
	
	//Helper methods
	private boolean isValidInteger(String sample) {
		boolean valid = false;
		try {
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error) {
			popup.displayText("You need to input an int " + sample + " is not an int");
		}
		return valid;
	}
	private boolean isValidDouble(String sample) {
		boolean valid = false;
		try {
			Double.parseDouble(sample);
			valid = true;
		}
		catch(NumberFormatException error) {
			popup.displayText("You need to input an double - " + sample + " is not an double");
		}
		return valid;
	}

}
