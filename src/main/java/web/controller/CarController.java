package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService cs;

    public CarController(CarService carService) {
        this.cs = carService;
    }


    @GetMapping
    public String showCars (@RequestParam(name="count", required = false) Integer count, Model model) {
        model.addAttribute("cars", cs.getCars(count));
        return "cars";
    }

}
