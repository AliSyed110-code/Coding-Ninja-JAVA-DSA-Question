package inheritance;

public class vehicle {
	private String color;
	protected int maxSpeed;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("vehicle " + "color " + color + " maxspeed " + maxSpeed);
	}
}
