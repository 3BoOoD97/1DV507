package ad222uk_assign1;

import java.util.ArrayList;

public abstract class Vehicle {
    protected int spaceRequired;   
    protected int vehicleFee;      
    protected int passengerFee;    
    protected int capacity;        
    protected boolean hasEmbarked = false; 
    protected ArrayList<Passenger> passengers;  

    public boolean hasEmbarked() {
        return this.hasEmbarked;
    }

    public int getSpaceRequired() {
        return this.spaceRequired;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(this.passengers.size() < this.capacity) {
            passenger.setFee(this.passengerFee);
            this.passengers.add(passenger);
        }
    }

    public void embark() {
        this.hasEmbarked = true;
    }

    public int getFee() {
        return this.vehicleFee;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}