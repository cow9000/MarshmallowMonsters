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
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmout, boolean hasBloop){
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
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
		String hasBloopText = " doesn't have a bloop.";
		if(hasBloop) hasBloopText = " does have a bloop.";
		return "This is " + name + ", he has " + eyeCount + " eyes, " + armCount + " arms, " + tentacleAmount  + " tentacles, and it " + hasBloopText;
	}
	
	
}
