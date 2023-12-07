package vehicles;

public abstract class Vehicles {
	protected String colour;
	private int maxspeed;

	public  Vehicles(int maxspeed) {
		this.maxspeed = maxspeed;
     System.out.println("vehicles Constructor");
	}

//	public  Vehicles() {
//     System.out.println("vehicles Constructor");
//	}

	public abstract boolean isMotorized();
	
	public abstract String getCompany();
	
	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	public  void print() {
		System.out.println("vehicle colour : " + colour);
		System.out.println("vehicle speed : " + maxspeed);
	}

}
