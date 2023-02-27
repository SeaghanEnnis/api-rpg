package io.simplerpg.apirpg.LevelOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.simplerpg.apirpg.LevelOne.Business.GenerateResponse;
import io.simplerpg.apirpg.LevelOne.Models.SimpleResponse;

@Controller
@RequestMapping(value = "/LevelOne")
public class Level1Controller {

    @Autowired
    GenerateResponse responseGenerator;

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.Welcome), responseHeaders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/PartOne")
    public ResponseEntity<String> partOne(){
        
        HttpHeaders responseHeaders = new HttpHeaders();
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartOne), responseHeaders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/Part2")
    public ResponseEntity<String> part2(){
        
        HttpHeaders responseHeaders = new HttpHeaders();

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.Part2), responseHeaders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/PartThree")
    public ResponseEntity<String> partThree(@RequestBody String body){
        
        HttpHeaders responseHeaders = new HttpHeaders();

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartThree), responseHeaders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/PartThree")
    public ResponseEntity<String> partFour(@RequestBody String body){
        
        HttpHeaders responseHeaders = new HttpHeaders();

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartThree), responseHeaders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

