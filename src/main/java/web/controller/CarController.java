package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService cs;

    public CarController(CarService carService) {
        this.cs = carService;
    }


    @GetMapping
    public String showCars (Model model){
        model.addAttribute("cars", cs.getAllCars());
        return "cars";
    }

}
