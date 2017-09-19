package monster.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	public void start()
	{
		// MarshmallowMonster monster = new MarshmallowMonster();
		// System.out.println(monster);

		MarshmallowMonster donny = new MarshmallowMonster("Donny", 1, 8, 2, true);
		System.out.println(donny);

		donny.setArmCount(donny.getArmCount() - 1);

		System.out.println(donny);

		interactWithMonster(donny);

	}

	private void interactWithMonster(MarshmallowMonster monster)
	{
		Scanner myScanner = new Scanner(System.in);

		System.out.println(monster.getName() + " wants to know how many eyes you want to eat. How many you want to eat?");
		int consumed = myScanner.nextInt();

		monster.setEyeCount(monster.getEyeCount() - consumed);
		System.out.println(monster);

		monster.setArmCount(1000000);
		System.out.println(monster);

		System.out.println("How many arms are you interested in eating? I have " + monster.getArmCount());
		// consumed = myScanner.nextInt();
		int armEat = myScanner.nextInt();

		if (armEat == 0)
		{
			System.out.println("Not hungry? So sad.....");
		}
		else if (armEat < 0 || armEat > monster.getArmCount())
		{
			System.out.println("Invalid sorry matey. YOU CANT DO THIS...<><><><><><><ååååfthrhreh><><å><><><><><><>å<aaaaaaaaaaaaae0><bbbbbbbbbbn><><><å><><>åå");
		}
		else
		{

			monster.setArmCount(monster.getArmCount() - armEat);
			System.out.println("Okay, now I have this many arms " + monster.getArmCount());

		}
		System.out.println("I grew 10000 eyes");
		monster.setEyeCount(monster.getEyeCount() + 10000);

		System.out.println("How many eyes you want to eat?");
		int eyeEat = myScanner.nextInt();
		if (eyeEat == 0)
		{
			System.out.println("EATT MEEEE");
		}
		else if (eyeEat > monster.getEyeCount() || eyeEat < 0)
		{
			System.out.print("I dont have that many eyes");
		}
		else
		{
			monster.setEyeCount(monster.getEyeCount() - eyeEat);
			System.out.print("You ate some eyes");
		}

		System.out.println("How many tentacles do you want to eat? I have " + monster.getTentacleAmount());

		double eatTentacles = myScanner.nextDouble();
		if (eatTentacles == monster.getTentacleAmount())
		{
			System.out.println("You ate all my tentacles");
		}
		else
		{
			System.out.println("More likely");
		}

		myScanner.close();
	}

}
