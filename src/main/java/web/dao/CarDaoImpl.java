package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "DeLorean", 1981));
        cars.add(new Car(2, "Opel", 2013));
        cars.add(new Car(3, "Toyota", 1995));
        cars.add(new Car(4, "Audi", 2010));
        cars.add(new Car(5, "BMW", 2020));
    }

    @Override
    public List<Car> showCars(Integer number) {
        if ((number == null) || (number >= cars.size()) || (number < 0)) {
            return cars;
        }
        return cars.subList(0, number);
    }
}
