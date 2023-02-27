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

    public String validatePartFour(String body) throws Exception{

        if(body.equals("stone in order")){
            return "stone in order";
        }else{
            throw new Exception("Error in Part Three Validation!");
        }
    }

    public String validatePartFive(String body) throws Exception{

        if(body.equals("2756")){
            return "2756";
        }else{
            throw new Exception("Error in Part Three Validation!");
        }
    }
    
}
