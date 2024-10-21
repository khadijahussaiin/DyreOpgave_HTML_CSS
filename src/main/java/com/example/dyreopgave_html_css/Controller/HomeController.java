package com.example.dyreopgave_html_css.Controller;

import com.example.dyreopgave_html_css.Model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }
    @PostMapping("/lionData")
    public String lionData(Model model) {
        Lion lion = new Lion("Savanne", "Gylden", "Kød", "Løver er kendt som 'dyrenes konge'", 190.5);
        model.addAttribute("lion", lion);
        return "home/lionData";
    }
    @PostMapping("/elephantData")
    public String elephantData(Model model) {
        Elephant elephant = new Elephant("Sydafrika", "Grå", "Planter", "Elefanter har fremragende hukommelse!", 5000.0);
        model.addAttribute("elephant", elephant);
        return "home/elephantData";
    }
    @PostMapping("/giraffeData")
    public String giraffeData(Model model) {
        // Opretter en instans af Giraffe med sample-data
        Giraffe giraffe = new Giraffe("Savanne", "Brun og gul", "Blade fra træer", "Giraffer er de højeste dyr på jorden!", 800.0);

        // Tilføjer giraffe-objektet til modellen, så vi kan bruge det i viewet
        model.addAttribute("giraffe", giraffe);

        // Returnerer viewet (HTML-filen), der skal vises
        return "home/giraffeData";
    }
    @PostMapping("/wildebeestData")
    public String wildebeestData(Model model) {
        Wildebeest wildebeest = new Wildebeest("Græsarealer", "Brun og sort", "Græs", "Gnuen kan løbe op til 80 km/t!", 250.0);
        model.addAttribute("wildebeest", wildebeest);
        return "home/wildebeestData";
    }
    @PostMapping("/sharkData")
    public String sharkData(Model model) {
        Shark shark = new Shark("Ocean", "Grå og hvid", "Fisk", "Hajer har eksisteret i over 400 millioner år!", 1100.0);
        model.addAttribute("shark", shark);
        return "home/sharkData";

    }
}