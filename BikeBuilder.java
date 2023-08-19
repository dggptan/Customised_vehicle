public class BikeBuilder implements VehicleBuilder{
    private Bike bike;
    private Car car;

    BikeBuilder(){
        this.bike = new Bike();
    }

    @Override
    public void BuildAirbags() {
        bike.setAirbags(false);
        
    }

    @Override
    public void BuildEngine() {
        bike.setEngine("200 CC Engine");
    }

    @Override
    public void BuildGPS() {
        bike.setGPS("Automatic");
        
    }

    @Override
    public void BuildSeats() {
        bike.setSeats(2);
    }

    @Override
    public void BuildType() {
        bike.setType("Semi-Metallic");
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
