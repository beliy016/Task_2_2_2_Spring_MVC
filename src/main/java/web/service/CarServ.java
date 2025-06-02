package web.service;

import web.model.Car;
import java.util.List;

public interface CarServ {
    public List<Car> getCars(List<Car> list, int count);
}
