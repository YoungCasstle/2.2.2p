package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String getCars(Model model, @RequestParam(required = false) Integer count) {
        model.addAttribute("cars", carService.getListCar(count != null ? count : 0));
        return "cars";
    }
}
