package monster.model;

public class MarshmallowMonster
{
	
	//Declaration variables
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	//Constructor
	public MarshmallowMonster() {
		//Initializes everything.
		this.name = "Normal Joe";
		this.eyeCount = 1;
		this.armCount = 2;
		this.tentacleAmount = 1;
		this.hasBloop = false;
	}
	
	//Another constructor with parameters
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmount, boolean hasBloop){
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
	//setter methods
	public void setName(String name) {
		//Set method name to name
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount) {
		//set eyecount method datamember to eyecount
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount) {
		//set armcound method datamember to parameter value
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount) {
		//set method datamember to parameter value
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setHasBloop(boolean hasBloop) {
		this.hasBloop = hasBloop;
	}
	
	
	//Return methods, all of these return specified data member
	public String getName() {
		return name;
	}
	
	public int getEyeCount() {
		return eyeCount;
	}
	
	public int getArmCount() {
		return armCount;
	}
	
	public double getTentacleAmount() {
		return tentacleAmount;
	}
	
	public boolean getHasBloop() {
		return hasBloop;
	}
	
	//When this is called, return description.
	public String toString() {
		String hasBloopText = "doesn't have a bloop.";
		if(hasBloop) hasBloopText = "does have a bloop.";
		
		String armCountText = "arm";
		if(armCount > 1 || armCount == 0) armCountText = "swole arms";
		
		String eyeCountText = "eye";
		if(eyeCount > 1 || eyeCount == 0) eyeCountText = "eyes";
		
		String tentacleAmountText = "tentacle";
		if(tentacleAmount > 1) tentacleAmountText = "tentacles";
		
		String description = "This is " + name + ", he has " + eyeCount + " " + eyeCountText + ", " + armCount + " "; 
		description += armCountText +", " + tentacleAmount  + " " + tentacleAmountText + ", and it " + hasBloopText + ". This is a desert rainfrog, squeaking, viral sensation. 11 Million hits and counting, it sounds like a dog toy.";
		return description;
	}
	
	
}
