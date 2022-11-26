package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.dao.CarsDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarsDao carsDao;

    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getListCar(Integer count) {
        List<Car> carList = carsDao.getListCar();
        if (count <= 0 || carList.size() <= count) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
