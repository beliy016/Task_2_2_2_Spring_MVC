package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServImpl implements CarServ {

    public List<Car> listCars = Arrays.asList(
            new Car("Опель", "красный", 1500),
            new Car("Ауди", "чёрный", 4000),
            new Car("Хавал", "белый", 1400),
            new Car("Тойота", "зелёный", 8000),
            new Car("Лада", "синий", 500)
    );

    @Override
    public List<Car> getCars(List<Car> list, int count) {
        if (count < list.size()) {
            List<Car> res = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                res.add(list.get(i));
            }
            return res;
        } else return list;
    }
}
