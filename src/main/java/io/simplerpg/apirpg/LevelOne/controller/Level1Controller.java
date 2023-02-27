package io.simplerpg.apirpg.levelone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import io.simplerpg.apirpg.levelone.business.GenerateResponse;
import io.simplerpg.apirpg.levelone.business.ValidateInput;
import io.simplerpg.apirpg.levelone.models.SimpleResponse;

@Controller
@RequestMapping(value = "/LevelOne")
public class Level1Controller {

    @Autowired
    GenerateResponse responseGenerator;

    @Autowired
    ValidateInput inputValidator;


    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.Welcome), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/PartOne")
    public ResponseEntity<String> partOne(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartOne), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/Part2")
    public ResponseEntity<String> part2(){
    
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.Part2), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/PartThree")
    public ResponseEntity<String> partThree(@RequestBody String body){

        final Logger logger = LoggerFactory.getLogger(Level1Controller.class);
        logger.info(body);

        try{
            inputValidator.validatePartThree(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartThree), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/PartFour")
    public ResponseEntity<String> partFour(@RequestBody String body){

        try{
            inputValidator.validatePartFour(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.PartThree), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

