import enums.Car;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class BasicServicing implements IService {

    private Car car;

    private static Map<Car, Integer> carTypePrice = new HashMap<Car, Integer>();


    public BasicServicing(Car car){



        this.car = car;
        carTypePrice.put(Car.SEDAN, 4000);
        carTypePrice.put(Car.HATCHBACK, 2000);
        carTypePrice.put(Car.SUV, 5000);
    }

    @Override
    public float getPrice() {
        return carTypePrice.get(this.car);
    }
}
