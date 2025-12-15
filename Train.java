import java.util.ArrayList;

public class Train implements TrainRequirements {
    
    /** 
     * The engine
     */
    private Engine engine;

    /** 
     * The list of cars in the train
     */
    private ArrayList<Car> cars;

    /**
     * Construct a new Train 
     * @param fuelType engine fuel type
     * @param currentFuelLevel current fuel level 
     * @param fuelCapacity maximum fuel capacity 
     * @param nCars number of cars 
     * @param passengerCapacity capacity for each car
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /** 
     * @return the engine for the train 
     */
    public Engine getEngine() {
        return this.engine;  
    }
    
    /**
     * @param i index of car to return
     * @return the requested Car
     */
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        } else {
            return null;
        }
    }

    /** 
     * @return the maximum capacity of all cars 
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car c : cars) {
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    /** 
     * @return the total number of empty seats in all cars 
     */
    public int seatsRemaining() {
        int totalSeats = 0;
        for (Car c : cars) {
            totalSeats += c.seatsRemaining();
        }
        return totalSeats;
    }

    /**
     * Print a manifest for the train
     */
    public void printManifest() {
        System.out.println("Train Passenger Manifest:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars.get(i).printManifest();
        }
    }
}
