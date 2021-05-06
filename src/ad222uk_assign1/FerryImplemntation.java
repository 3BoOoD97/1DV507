package ad222uk_assign1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FerryImplemntation implements Ferry {

	    private List<Vehicle> vehicles;
	    private int moneyEarned;
	    private int availableVehicleSpace;
	    private int availablePassengerSpace;
	    private int maxVehicleSpace = 200; 
	    private int maxPassengerSpace = 200; 


	    public FerryImplemntation() {
	        this.moneyEarned = 0;
	        init();
	    }

	    private void init() {
	        this.availableVehicleSpace = this.maxVehicleSpace;
	        this.availablePassengerSpace = this.maxPassengerSpace;
	        this.vehicles = new ArrayList<Vehicle>();
	    }


	    public int countPassengers() {
	        return this.maxPassengerSpace - this.availablePassengerSpace;
	    }

@Override	    public int countVehicleSpace() {
	        int count = 0;
	        for(Vehicle vehicle : vehicles) {
	            count += vehicle.getSpaceRequired();
	        }
	        return count / 5; 
	    }

	    public int countMoney() {
	        return this.moneyEarned;
	    }

	    @SuppressWarnings("unchecked")
		public Iterator iterator() {
	        return new VehicleIterator();
	    }

	    public void embark(Vehicle v) {
	        if(!v.hasEmbarked() && hasSpaceFor(v)) {
	            this.vehicles.add(v);
	            this.moneyEarned += v.getFee();
	            this.availableVehicleSpace -= v.getSpaceRequired();
	            v.embark();
	            for(Passenger p : v.passengers) {
	                embark(p);
	            }
	        }
	        else {
	            System.out.println(v.toString() + " doesn't fit. Skipping.");
	        }
	    }

	    public void embark(Passenger p) {
	        if(!p.embarked() && hasRoomFor(p)) {
	            this.moneyEarned += p.getFee();
	            p.embark();
	            this.availablePassengerSpace -= 1;
	        }
	        else {
	            System.out.println(p.toString() + " doesn't fit. Skipping. Their vehicle is still embarked though. This is" +
	                    " completely in accordance with the requirements for this assignment.");
	        }
	    }

	    
	    public void disembark() {
	        for(Vehicle vehicle : this.vehicles) {
	            for(Passenger p : vehicle.passengers) {
	                if(p.embarked()) {
	                    p.disembark();
	                }
	            }
	           
	        }
	        init();
	    }

	    // Return true if there's room for the vehicle
	    public boolean hasSpaceFor(Vehicle v) {
	        return v.getSpaceRequired() <= this.availableVehicleSpace;
	    }

	    public boolean hasRoomFor(Passenger p) {
	        return 1 <= this.availablePassengerSpace;
	    }

	    public String toString() {
	        
	        int bicycles = 0;
	        int cars = 0;
	        int buses = 0;
	        int lorries = 0;
	        int passengers = countPassengers();
	        int vehicleSpace = (maxVehicleSpace / 5) - countVehicleSpace();
	        for(Vehicle vehicle : this.vehicles) {
	            if(vehicle.getClass() == Bicycle.class) {
	                bicycles++;
	            }
	            else if(vehicle.getClass() == Car.class) {
	                cars++;
	            }
	            else if(vehicle.getClass() == Bus.class) {
	                buses++;
	            }
	            else if(vehicle.getClass() == Lorry.class) {
	                lorries++;
	            }
	        }

	       
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append("The ferry currently holds:\n");
	        stringBuilder.append(bicycles + " bicycles\n");
	        stringBuilder.append(cars + " cars\n");
	        stringBuilder.append(buses + " buses\n");
	        stringBuilder.append(lorries + " lorries\n");
	        stringBuilder.append(passengers + " Passanger\n");
	        stringBuilder.append(vehicleSpace + " empty spaces left for additional vehicles");

	        return stringBuilder.toString();
	    }

	    class VehicleIterator implements Iterator<Vehicle> {
	        private int count = 0;
	        public Vehicle next() {return vehicles.get(count++);}

	        public boolean hasNext() {return count < vehicles.size();}
	    }
	}
