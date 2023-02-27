package io.simplerpg.apirpg.levelone.business;

import org.springframework.stereotype.Component;

@Component
public class ValidateInput {

    public String validatePartThree(String body) throws Exception{

        if(body.equals(" ")){
            return " ";
        }else{
            throw new Exception("Error in Part Three Validation!");
        }
    }

    public String validatePartFour(String body){
        return "";
    }
    
}
