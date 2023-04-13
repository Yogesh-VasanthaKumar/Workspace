import enums.Car;
import interfaces.IService;
import interfaces.IServiceProvider;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ServiceProvider implements IServiceProvider {

    List<IService> services = new ArrayList<>();

    private Car car;

    public ServiceProvider(Car car, List<String> services) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        this.car = car;
        for(String serviceName:services){
            Class <?> clas= Class.forName(serviceName);
        Constructor<?> cons = clas.getConstructor(Car.class);
        IService service = (IService) cons.newInstance(car);
        this.services.add(service);
        }
    }


    public List<Float> getPrice(){
        List<Float> a = new ArrayList<>();
        for(IService service:services){
            a.add(service.getPrice());
        }
        return a;
    }
    @Override
    public float getTotalPrice() {
        float totalPrice = 0.0f;
        for(IService service: services){
            totalPrice+=service.getPrice();
        }
        return totalPrice;
    }

    @Override
    public boolean startService() {
        return false;
    }
}
