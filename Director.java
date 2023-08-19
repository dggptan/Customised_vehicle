public class Director {
    private VehicleBuilder vehicleBuilder;


    public Director(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }
    

    public Car getCar(){
        return this.vehicleBuilder.getCar();
    }

    public Bike getBike(){
        return this.vehicleBuilder.getBike();
    }

    public void constructCar(){
        this.vehicleBuilder.BuildAirbags();
        this.vehicleBuilder.BuildEngine();
        this.vehicleBuilder.BuildGPS();
        this.vehicleBuilder.BuildSeats();
        this.vehicleBuilder.BuildType();
    }
}
