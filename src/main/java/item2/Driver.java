package item2;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.HAM;
import static item2.Pizza.Topping.ONION;
import static item2.Pizza.Topping.SAUSAGE;

public class Driver {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder().
                addTopping(HAM).
                sauceInside().
                build();
    }
}
