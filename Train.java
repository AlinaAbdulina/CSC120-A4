public class Train implements TrainRequirements.java {
    //Attributes
    private Engine engine;
    private ArrayList<Car> cars;

    //Constructor
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>();
    }

    //Accessors
    public Engine getEngine() {
        return engine;  
    
    public getCar(int i) {
        return cars.get(i);
    }

    public getMaxCapacity() {
        int totalCapacity = 0;
        for (Car c : cars) {
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    public seatsRemaining() {
        int totalSeats = 0;
        for (Car c : cars) {
            totalSeats += c.seatsRemaining();
        }
        return totalSeats;
    }

    public printManifest() {
        //print roster of passengers
    }
}
