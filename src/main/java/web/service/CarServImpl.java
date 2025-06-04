package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;
import java.util.List;

@Service
public class CarServImpl implements CarServ {

    @Autowired
    private CarDAO dao;

    @Override
    public List<Car> getCarsByCount(List<Car> list, int count) {
        return dao.getCarsByCount(list, count);
    }
}
