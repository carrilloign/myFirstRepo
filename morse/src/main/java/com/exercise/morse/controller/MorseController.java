package com.exercise.morse.controller;

import com.exercise.morse.MorseApplication;
import com.exercise.morse.service.MorseToSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @Autowired
    private MorseToSp morseTranslator;

    @GetMapping
    public String sayHello(){
        return "Morse application homepage";
    }

    @GetMapping(path = "/{morse}")
    public String morseToSp(@PathVariable String morse){
        return  morseTranslator.toSp(morse);
    }
}
