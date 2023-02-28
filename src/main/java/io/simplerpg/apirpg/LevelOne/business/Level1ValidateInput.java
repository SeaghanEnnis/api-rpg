package io.simplerpg.apirpg.levelone.business;

import org.springframework.stereotype.Component;

@Component
public class Level1ValidateInput {

    public String validatePartThree(String body) throws Exception{

        if(body.equalsIgnoreCase(" ")){
            return " ";
        }else{
            throw new Exception("Error in Part Three Validation!");
        }
    }

    public String validatePartFour(String body) throws Exception{

        if(body.equalsIgnoreCase("stone in order")){
            return "stone in order";
        }else{
            throw new Exception("Error in Part Four Validation!");
        }
    }

    public String validatePartFive(String body) throws Exception{

        if(body.equalsIgnoreCase("2756")){
            return "2756";
        }else{
            throw new Exception("Error in Part Five Validation!");
        }
    }

    public String validatePartSix(String body) throws Exception{

        if(body.equalsIgnoreCase("relief")){
            return "relief";
        }else{
            throw new Exception("Error in Part Siz Validation!");
        }
    }
    
}
