package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String SayHello(){
        System.out.println("Pozdravljen svet");

        return "Ojla prijatelji!!!";
    }
}