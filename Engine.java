public class Engine implements EngineRequirements{

    /** 
     * The fuel type used
     */
    private FuelType fuelType; 

    /** 
     * The current amount of fuel in the engine
     */
    private double currentFuel;

    /** 
     * The maximum fuel capacity
     */
    private double maxFuel;    

    /**
     * Construct new Engine
     * @param fuelType the fuel type used 
     * @param currentFuel the starting fuel level
     * @param maxFuel the maximum fuel capacity
     */
    public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    /** 
     * @return the fuel type of the engine 
     */
    public FuelType getFuelType() {
        return this.fuelType;
    }

    /** 
     * @return the maximum fuel capacity 
     */
    public double getMaxFuel() {
        return this.maxFuel;
    }

    /** 
     * @return the current fuel level 
     */
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    /**
     * Refill the engine
     */
    public void refuel() {
        this.currentFuel = this.maxFuel;
    } 

    /**
     * @return true if there was fuel to consume
     */
    public Boolean go() {
        if (this.currentFuel > 0) {
            this.currentFuel -= 1.0; 
            System.out.println("Remaining fuel level: " + this.currentFuel);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Test Engine
     */
   public static void main(String[] args) {
       Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
       while (myEngine.go()) {
           System.out.println("Choo choo!");
       }
       System.out.println("Out of fuel.");
   }
}