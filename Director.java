public class Director {
    private CarBuilder carBuilder;
    private BikeBuilder bikeBuilder;


    public Director() {
        this.carBuilder = carBuilder;
        this.bikeBuilder = bikeBuilder;
    }
    

    public Car getCar(){
        return this.carBuilder.getCar();
    }

    public Bike getBike(){
        return this.bikeBuilder.getBike();
    }

    public void constructCar(CarBuilder carBuilder){
        this.carBuilder.BuildAirbags();
        this.carBuilder.BuildEngine();
        this.carBuilder.BuildGPS();
        this.carBuilder.BuildSeats();
        this.carBuilder.BuildType();
    }

    public void constructBike(BikeBuilder bikeBuilder){
        this.bikeBuilder.BuildAirbags();
        this.bikeBuilder.BuildEngine();
        this.bikeBuilder.BuildGPS();
        this.bikeBuilder.BuildSeats();
        this.bikeBuilder.BuildType();
    }
}
