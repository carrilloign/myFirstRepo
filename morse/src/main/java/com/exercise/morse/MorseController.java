package com.exercise.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping
    public String sayHello(){
        return "Morse application homepage";
    }

    @GetMapping(path = "/{morse}")
    public String morseToSp(@PathVariable String morse){
        return  MorseToSp.toSp(morse);
    }
}
