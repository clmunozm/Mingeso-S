package com.example.evaluacion1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeController {

    @GetMapping("/mensaje")
    public String Mensaje(){
        return ("Hola Mundo");
    }
}
