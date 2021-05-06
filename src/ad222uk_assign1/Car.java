	package ad222uk_assign1;

import java.util.ArrayList;

public class Car extends Vehicle {
		    public Car() {
		        this.spaceRequired = 5;
		        this.passengerFee = 15;
		        this.vehicleFee = 100;
		        this.capacity = 4;
		        this.passengers = new ArrayList<Passenger>();
		    }
		}