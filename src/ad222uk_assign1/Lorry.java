package ad222uk_assign1;

import java.util.ArrayList;

public class Lorry extends Vehicle {



	    public Lorry() {
	        this.spaceRequired = 40;
	        this.passengerFee = 15;
	        this.vehicleFee = 300;
	        this.capacity = 2;
	        this.passengers = new ArrayList<Passenger>();
	    }
	}