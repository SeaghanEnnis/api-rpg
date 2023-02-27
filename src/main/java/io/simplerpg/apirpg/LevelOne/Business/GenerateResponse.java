package io.simplerpg.apirpg.levelone.business;

import org.springframework.stereotype.Component;

import io.simplerpg.apirpg.levelone.models.SimpleResponse;

@Component
public class GenerateResponse {

    public String GenerateLevelOneResonse(SimpleResponse response) throws Exception{
        switch(response){
            case Welcome:
                return "Welcome to API RPG!\n" +
                       "This is a game built around testing your API skills while also providing some puzzles and story!\n" +
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
                return "The stone fits well into its place, made smooth by your good craftsmanship. The stone being in order, the harmony of the structure will not be disturbed.\n" +
                       "Your fellows smile at you, the job being completed well. The morning has ended and the sun swealters overhead. Your return to the work below. \n" +
                       "The structure of the temple is magnificent. The grand designs of the masters are truly a sight to behold.\n" +
                       "The stone columns take their architecture from five orders: Tuscan, Doric, Ionic, Corinthian, and Composite.\n" +
                       "Corinthian and Composite columns had the most intricacies and beauty. Work on them was reservered for masters.\n" +
                       "Ionic columns were a favorite of King Soloman, denoting wisdom and justice. Work was reserved for fellows.\n" +
                       "Lastly were Doric or Tuscan columns, simple and strong. To advance from an apprentice to a fellow, the apprentice would create one of these columns.\n" +
                       "For each Corinthian column, there were two Ionic colums, and for each of those four Doric columns. With 9646 total columns, you wonder how many are Ionic?\n" +
                       "This simple math would be easy for master, who could post such answers in a mere five seconds.";
            default:
                throw new Exception("Could not find valid response");
        }

    }
}
