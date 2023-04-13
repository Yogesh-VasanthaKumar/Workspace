// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import interfaces.IServiceProvider;
import enums.Car;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        List<String> services=new ArrayList<>();
        services.add("BasicServicing");
        IServiceProvider serviceProvider = new ServiceProvider(Car.SEDAN,services);
        for(Float price: serviceProvider.getPrice()){
            System.out.println(price);
        }
        System.out.println(serviceProvider.getTotalPrice());
    }
}