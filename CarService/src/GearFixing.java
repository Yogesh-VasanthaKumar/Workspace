import enums.Car;
import interfaces.IService;

import java.util.HashMap;
import java.util.Map;

public class GearFixing implements IService
{

    private Car car;

    private static Map<Car, Integer> carTypePrice = new HashMap<Car, Integer>();
    {
        carTypePrice.put(Car.SEDAN, 6000);
        carTypePrice.put(Car.HATCHBACK, 3000);
        carTypePrice.put(Car.SUV, 8000);

    }

    GearFixing(Car car){
        this.car = car;
    }
    @Override
    public float getPrice() {
        return 0;
    }
}
