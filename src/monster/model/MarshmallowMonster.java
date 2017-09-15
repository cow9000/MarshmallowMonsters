package monster.model;

public class MarshmallowMonster
{
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster() {
		//Initializes everything.
		this.name = "Normal Joe";
		this.eyeCount = 1;
		this.armCount = 2;
		this.tentacleAmount = 1;
		this.hasBloop = false;
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmout, boolean hasBloop){
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount) {
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int armCount) {
		this.armCount = armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount) {
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setHasBloop(boolean hasBloop) {
		this.hasBloop = hasBloop;
	}
	
	
	//Return methods
	public String returnName() {
		return name;
	}
	
	public int returnEyeCount() {
		return eyeCount;
	}
	
	public int returnArmCount() {
		return armCount;
	}
	
	public double returnTentacleAmount() {
		return tentacleAmount;
	}
	
	public boolean returnHasBloop() {
		return hasBloop;
	}
	
	
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
		description += armCountText +", " + tentacleAmount  + " " + tentacleAmountText + ", and it " + hasBloopText;
		return description;
	}
	
	
}
