package vehicles;

public abstract class car extends Vehicles {

	int numGears;
	boolean isconvertible;

	public car() {
		super(100);
	}

	public car(int numGears, int maxspeed) {
		super(maxspeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}

	@Override
	public boolean isMotorized() {
		return false;
	}

	public boolean isconvertible() {
		return isconvertible;
	}

	public void printCar() {
		super.print();
//		System.out.println("car colour : "+ colour);
//		System.out.println("car speed : "+ getMaxspeed());
		System.out.println("car numGears : " + numGears);
		System.out.println("car isconvertible : " + isconvertible);
	}
}
