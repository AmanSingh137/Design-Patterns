import strategy.DrivingStrategy;

public class Vehicle implements DrivingStrategy{
    
    DrivingStrategy obj;

    // this is called constructor injection
    Vehicle (DrivingStrategy obj) {
        this.obj = obj;
    }

    @Override
    public void drive() {
        obj.drive();
    }
}
