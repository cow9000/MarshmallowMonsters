package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	public void start() {
		MarshmallowMonster monster = new MarshmallowMonster();
		System.out.println(monster);
		
		MarshmallowMonster george = new MarshmallowMonster("George",3,2,2,true);
		System.out.println(george);
	}
}
