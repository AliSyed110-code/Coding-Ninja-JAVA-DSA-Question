package vehicle_temp;

import vehicles.Vehicles;

public class Truck extends Vehicles{
  int maxLoadingCapacity;
  
  public void TruckPrint() {
	  System.out.println("maxCapacity " + maxLoadingCapacity);
	  System.out.println("colour " + colour);
	  System.out.println("maxSpeed " + getMaxspeed());
  } 
}
