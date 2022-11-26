package web.dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDaoImpl implements CarsDao {
    List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Bmw", "cross", 2000));
        list.add(new Car("Priora", "sport", 1500));
        list.add(new Car("Toyota", "camri", 1000));
        list.add(new Car("Hundai", "creta", 4500));
        list.add(new Car("Audi", "S3", 5000));

    }

    @Override
    public List<Car> getListCar() {
        return list;
    }
}
