package pl.pkubicki.git.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping({"/", "/home"})
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/favorite_vehicle")
    public String favoriteVehicle(Model model){
        model.addAttribute("brand", "Fiat");
        model.addAttribute("model", "Cinquecento");

        return "favveh";
    }
}
