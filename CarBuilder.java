public class CarBuilder implements VehicleBuilder{
    
    private Car car;
    private Bike bike;
    

    CarBuilder(){
        this.car = new Car();
    }

    @Override
    public void BuildAirbags() {
        car.setAirbags(true);
    }

    @Override
    public void BuildEngine() {
        car.setEngine("500 HP Engine");
    }

    @Override
    public void BuildGPS() {
        car.setGPS("Automatic");
        
    }

    @Override
    public void BuildSeats() {
        car.setSeats(5);
    }

    @Override
    public void BuildType() {
        car.setType("Metallic");
    }

    @Override
    public Car getCar() {
        return this.car;
    }

    @Override
    public Bike getBike() {
        return this.bike;
    }

    
}
