package io.simplerpg.apirpg.levelone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.simplerpg.apirpg.levelone.business.Level1GenerateResponse;
import io.simplerpg.apirpg.levelone.business.Level1ValidateInput;
import io.simplerpg.apirpg.levelone.models.Level1SimpleResponse;

@Controller
@RequestMapping(value = "/LevelOne")
public class Level1Controller {

    @Autowired
    Level1GenerateResponse responseGenerator;

    @Autowired
    Level1ValidateInput inputValidator;

    final Logger logger = LoggerFactory.getLogger(Level1Controller.class);


    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.Welcome), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/PartOne")
    public ResponseEntity<String> partOne(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.PartOne), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/Part2")
    public ResponseEntity<String> part2(){
    
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.Part2), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/PartThree")
    public ResponseEntity<String> partThree(@RequestBody String body){

        logger.info(body);

        try{
            inputValidator.validatePartThree(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.PartThree), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/PartFour")
    public ResponseEntity<String> partFour(@RequestBody String body){
        logger.info(body);

        try{
            inputValidator.validatePartFour(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.PartFour), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/PartFive")
    public ResponseEntity<String> partFive(@RequestBody String body){
        logger.info(body);

        try{
            inputValidator.validatePartFive(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.PartFive), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/PartSix")
    public ResponseEntity<String> partSix(@RequestBody String body){
        logger.info(body);

        try{
            inputValidator.validatePartSix(body);
        }catch (Exception e) {
            return new ResponseEntity<String>("Incorrect", new HttpHeaders(), HttpStatus.BAD_REQUEST);
        }

        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResponse(Level1SimpleResponse.PartSix), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

