package monster.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	public void start() {
		//MarshmallowMonster monster = new MarshmallowMonster();
		//System.out.println(monster);
		
		MarshmallowMonster donny = new MarshmallowMonster("Donny",1,8,2,true);
		System.out.println(donny);
		
		donny.setArmCount(donny.getArmCount() - 1);
		
		System.out.println(donny);
		
		interactWithMonster(donny);
		
	}
	
	private void interactWithMonster(MarshmallowMonster monster) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println(monster.getName() + " wants to know how many eyes you want to eat. How many you want to eat?");
		int consumed = myScanner.nextInt();
		
		monster.setEyeCount(monster.getEyeCount() - consumed);
		System.out.println(monster);
		
		monster.setArmCount(1000000);
		System.out.println(monster);
		
		System.out.println("How many arms are you interested in eating? I have " + monster.getArmCount());
		//consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0) {
			System.out.println("Not hungry? So sad.....");
		} else if(armEat < 0 || armEat > monster.getArmCount()) {
			System.out.println("Invalid sorry matey. YOU CANT DO THIS...<><><><><><><ååååfthrhreh><><å><><><><><><>å<aaaaaaaaaaaaae0><bbbbbbbbbbn><><><å><><>åå");
		}
		else {
			
			monster.setArmCount(monster.getArmCount() -  armEat);
			System.out.println("Okay, now I have this many arms " + monster.getArmCount());
		}
		
		
		
		myScanner.close();
	}
	
}
