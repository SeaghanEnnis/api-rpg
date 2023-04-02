package io.simplerpg.apirpg.leveltwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import io.simplerpg.apirpg.leveltwo.business.Level2GenerateResponse;
import io.simplerpg.apirpg.leveltwo.business.Level2ValidateInput;
import io.simplerpg.apirpg.leveltwo.models.Level2SimpleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = "/LevelTwo")
public class Level2Controller {

    @Autowired
    Level2GenerateResponse responseGenerator;

    @Autowired
    Level2ValidateInput inputValidator;

    final Logger logger = LoggerFactory.getLogger(Level2Controller.class);

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelTwoResponse(Level2SimpleResponse.Welcome), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Part1")
    public ResponseEntity<String> part1(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelTwoResponse(Level2SimpleResponse.Part1), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Part2")
    public ResponseEntity<String> part2(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelTwoResponse(Level2SimpleResponse.Part2), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Part3")
    public ResponseEntity<String> part3(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelTwoResponse(Level2SimpleResponse.Part3), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Part4")
    public ResponseEntity<String> part4(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelTwoResponse(Level2SimpleResponse.Part4), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
