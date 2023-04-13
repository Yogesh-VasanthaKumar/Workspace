import enums.Car;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class BrakeFixing implements IService {

    private Car car;

    private static Map<Car, Integer> carTypePrice = new HashMap<Car, Integer>();
    {
        carTypePrice.put(Car.SEDAN, 1500);
        carTypePrice.put(Car.HATCHBACK, 1000);
        carTypePrice.put(Car.SUV, 2500);

    }

    BrakeFixing(Car car){
        this.car = car;
    }
    @Override
    public float getPrice() {
        return 0;
    }
}
