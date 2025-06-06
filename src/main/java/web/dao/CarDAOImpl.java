package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    public List<Car> listCars = Arrays.asList(
            new Car("Опель", "красный", 1500),
            new Car("Ауди", "чёрный", 4000),
            new Car("Хавал", "белый", 1400),
            new Car("Тойота", "зелёный", 8000),
            new Car("Лада", "синий", 500)
    );

    @Override
    public List<Car> getCarsByCount(int count) {
        return count <= 0 ? listCars : listCars.stream().limit(count).toList();
    }
}
