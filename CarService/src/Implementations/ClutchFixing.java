package Implementations;

import enums.Car;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class ClutchFixing implements IService {
    private Car car;

    private static Map<Car, Integer> carTypePrice = new HashMap<Car, Integer>();
    {
        carTypePrice.put(Car.SEDAN, 4000);
        carTypePrice.put(Car.HATCHBACK, 2000);
        carTypePrice.put(Car.SUV, 6000);

    }

    ClutchFixing(Car car){
        this.car = car;
    }
    @Override
    public float getPrice() {
        return 0;
    }


}
