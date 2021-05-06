package ad222uk_assign1;

import java.util.ArrayList;

public class Bus extends Vehicle {
    public Bus() {
        this.spaceRequired = 20;
        this.passengerFee = 10;
        this.vehicleFee = 200;
        this.capacity = 20;
        this.passengers = new ArrayList<Passenger>();
    }
}