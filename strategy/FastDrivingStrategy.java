package strategy;

public class FastDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Driving at the speed of 80mph");
    }
}
