package StrategyDesign.strategy;

public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive(){
        System.out.println("Driving at the speed of 25kmph.");
    }
}
