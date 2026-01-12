package StrategyDesign;

import StrategyDesign.strategy.NormalDrivingStrategy;

public class LocalAuto extends Vehicle{
    LocalAuto() {
        super(new NormalDrivingStrategy());
    }
}
