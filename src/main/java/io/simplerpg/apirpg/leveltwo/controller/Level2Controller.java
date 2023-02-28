package io.simplerpg.apirpg.leveltwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value = "/LevelTwo")
public class Level2Controller {

    final Logger logger = LoggerFactory.getLogger(Level2Controller.class);

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){
        
        try {
            return new ResponseEntity<String>(responseGenerator.GenerateLevelOneResonse(SimpleResponse.Welcome), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
