package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServ;

@Controller
public class CarsController {

    @Autowired
    private CarServ service;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value="count", required = false, defaultValue = "5") Integer count, Model model) {
        model.addAttribute("auto", service.getCarsByCount(count));
        return "cars";
    }
}
