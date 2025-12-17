public class Passenger implements PassengerRequirements {
    
    /** 
     * The passenger's name
     */
    private String name;

    /**
     * Create a new Passenger
     * @param name the passenger's name
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /** 
     * @return the passenger's name 
     */
    public String getName() {
        return name;
    }

    /**
    * @return the passenger's name as a string
    */
    @Override
    public String toString() {
        return this.name;
    }
    
    /**
     * Board the car
     * @param c the car to board
     */
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * Leave the car 
     * @param c the car to leave
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }
}
