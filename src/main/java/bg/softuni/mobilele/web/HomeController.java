package bg.softuni.mobilele.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

//    @GetMapping("http://localhost:8080/offers/add")
//    public String addOffer() {
//        return "offer-add";
//    }
}
