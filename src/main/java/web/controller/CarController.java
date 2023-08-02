package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService cs;

    public CarController(CarService carService) {
        this.cs = carService;
    }


    @GetMapping
    public String showCars (@RequestParam(name="count", required = false) Integer count, Model model) {
        List<Car> allCars = cs.getAllCars();

        if (count != null && count < allCars.size()) {
            List<Car> displayedCars = allCars.subList(0, count);
            model.addAttribute("cars", displayedCars);
        } else {
            model.addAttribute("cars", allCars);
        }
        return "cars";
    }

}
