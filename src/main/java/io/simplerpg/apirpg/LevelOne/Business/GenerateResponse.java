package io.simplerpg.apirpg.LevelOne.Business;

import org.springframework.stereotype.Component;

import io.simplerpg.apirpg.LevelOne.Models.SimpleResponse;

@Component
public class GenerateResponse {

    public String GenerateLevelOneResonse(SimpleResponse response) throws Exception{
        switch(response){
            case Welcome:
                return "Welcome to API RPG!\n" +
                       "This is a game built around testing your API skills while also providing some puzzles!\n" +
                       "Feel free to GET your way to LevelOne/PartOne!";
            case PartOne:
                return "You remember a time during your apprenticeship. Your fellow repremanding the stone you carved. He stated, \"consistancy is everything in your work\".\n" +
                       "You look down the rock, mishapened and rugged. 2 parts jutting out from the middle of the width lead you onward.";
            case Part2:
                return "You begrudingly acknowledge the correctness of your fellow, striking the rock again and again till the stone becomes flat.\n" +
                       "You, with the help of three fellows, slide the stone, into an empty space, next to your empty post.";
            case PartThree:
                return "The stone is heavy, but nothing the wooden sled and strong fellows could not handle.\n" +
                       "You all continue on, during the progress of the morning. The wise King Soloman knows the heat of the day would be too much to labour under.\n" +
                       "Once you have reached the place of the temple, you put the \"stone in order\". The fourth block of your work.";
            case PartFour:
                return "  ";
            default:
                throw new Exception("Could not find valid response");
        }

    }
}
