package io.simplerpg.apirpg.LevelOne;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.simplerpg.apirpg.LevelOne.Business.GenerateResponse;

@Controller
@RequestMapping(value = "/LevelOne")
public class Level1Controller {

    @Autowired
    GenerateResponse responseGenerator;

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        String message = "Welcome to API RPG!\nThis is a game built around testing your API skills while also providing some puzzles! Feel free to GET your way to LevelOne/PartOne!";

        return new ResponseEntity<String>(message, responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/PartOne")
    public ResponseEntity<String> partOne(){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        String message = "An important part of APIs (and coding in general) is consistantcy in naming. Unfortunatly for you, you're gonna have to find part 2 on your own!.";

        return new ResponseEntity<String>(message, responseHeaders, HttpStatus.OK);
    }
    
    @GetMapping("/Part2")
    public ResponseEntity<String> part2(){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        String message = "An important part of APIs (and coding in general) is consistantcy in naming. Unfortunatly for you, you're gonna have to find part 2 on your own!.";

        return new ResponseEntity<String>(message, responseHeaders, HttpStatus.OK);
    }
}
