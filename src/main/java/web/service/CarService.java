package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Kate", 1351, 1));
        cars.add(new Car("Olga", 2154, 2));
        cars.add(new Car("Karen", 6545, 3));
        cars.add(new Car("Tim", 4526, 4));
        cars.add(new Car("Sam", 3335, 5));
    }

    public List<Car> getCars(Integer count) {
        if (count != null && count < cars.size()) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}


