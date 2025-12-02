import strategy.FastDrivingStrategy;

public class SportyVehicle extends Vehicle {
    SportyVehicle(){
        super(
            new FastDrivingStrategy()
        );
    }
}
