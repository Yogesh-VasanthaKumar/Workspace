package interfaces;

import java.util.List;

public interface IServiceProvider {
    float getTotalPrice();
     List<Float> getPrice();
    boolean startService();
}
