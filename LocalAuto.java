import strategy.NormalDrivingStrategy;

public class LocalAuto extends Vehicle{
    LocalAuto() {
        super(new NormalDrivingStrategy());
    }
}
