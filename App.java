public class App {
    public static void main(String[] args) {
        
        // VehicleBuilder carBuilder = new CarBuilder();
        // VehicleBuilder bikeBuilder = new BikeBuilder();

        // Director director = new Director();

        // director.constructCar((CarBuilder) carBuilder);
        // director.constructBike((BikeBuilder) bikeBuilder);

        // VehicleBuilder car = (VehicleBuilder) carBuilder.getCar();
        // VehicleBuilder bike = (VehicleBuilder) bikeBuilder.getBike();

        // System.out.println(car);
        // System.out.println(bike);

        VehicleBuilder carBuilder = new CarBuilder();
        Director director = new Director(carBuilder);
        director.constructCar();
        Vehicle veh = carBuilder.getCar();
        veh.display();
        
        
    }
}
