import enums.Car;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class EngineServicing implements IService {

    private Car car;

    private static Map<Car, Integer> carTypePrice = new HashMap<Car, Integer>();
    {
        carTypePrice.put(Car.SEDAN, 8000);
        carTypePrice.put(Car.HATCHBACK, 5000);
        carTypePrice.put(Car.SUV, 10000);

    }

    EngineServicing(Car car){
        this.car = car;
    }
    @Override
    public float getPrice() {
        return 0;
    }
}
