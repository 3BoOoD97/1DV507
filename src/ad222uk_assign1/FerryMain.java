package ad222uk_assign1;

public class FerryMain {
	
	public static void main(String[] args) {
		
		 Ferry ferry = new FerryImplemntation();


	        for(int i = 0; i < 3; i++) {
	            Vehicle bus = new Bus();
	            for(int j = 0; j < bus.capacity; j++) {
	                bus.addPassenger(new Passenger());
	            }
	            ferry.embark(bus);
	        }

	        for(int i = 0; i < 2; i++) {
	            Vehicle lorry = new Lorry();
	            for(int j = 0; j < lorry.capacity; j++) {
	                lorry.addPassenger(new Passenger());
	            }
	            ferry.embark(lorry);
	        }

	        for(int i = 0; i < 8; i++) {
	            Vehicle car = new Car();
	            for(int j = 0; j < car.capacity; j++) {
	                car.addPassenger(new Passenger());
	            }
	            ferry.embark(car);
	        }

	        for(int i = 0; i < 20; i++) {
	            Vehicle bicycle = new Bicycle();
	            for(int j = 0; j < bicycle.capacity; j++) {
	                bicycle.addPassenger(new Passenger());
	            }
	            ferry.embark(bicycle);
	        }

	        System.out.println(ferry.toString());

	        ferry.disembark();

	        System.out.println(ferry.toString());

	        System.out.println("Money made so far: " + ferry.countMoney());

	    }
	}