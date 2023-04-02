package io.simplerpg.apirpg.levelone.business;

import org.springframework.stereotype.Component;

import io.simplerpg.apirpg.levelone.models.Level1SimpleResponse;

@Component
public class Level1GenerateResponse {

    public String GenerateLevelOneResponse(Level1SimpleResponse response) throws Exception{
        switch(response){
            case Welcome:
                return "Welcome to API RPG!\n" +
                       "This is a game built around testing your API skills while also providing some puzzles and story!\n" +
                       "Feel free to GET your way to LevelOne/PartOne!";
            case PartOne:
                return "Your name is Alexander. You remember a time during your apprenticeship. Your fellow repremanding the stone you carved. He stated, \"consistancy is everything in your work\".\n" +
                       "You look down the rock, mishapened and rugged. 2 parts jutting out from the middle of the width lead you onward.";
            case Part2:
                return "You begrudingly acknowledge the correctness of your fellow, striking the rock again and again till the stone becomes flat.\n" +
                       "You, with the help of three fellows, slide the stone, into an empty space, next to your empty post upon the outermost wall.";
            case PartThree:
                return "The stone is heavy, but nothing the wooden sled and strong fellows could not handle.\n" +
                       "You all continue on, during the progress of the morning. The wise King Soloman knows the heat of the day would be too much to labour under.\n" +
                       "Once you have reached the correct place of the walls of the temple, you put the \"stone in order\". The fourth block of your own work.";
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
            case PartFive:
                return "You here the gong ring through the hall. It is the hour of refreshment, selected from the peak of the day, as the sun is at its warmest.\n" +
                       "Ready to quench your thirst and satiate your stomach, you march to the mess hall. As with all good meals, you pause to thank the grandmasters, mentally, for their generosity.\n"+
                       "Navoreen, the holy priest, calls out: let us bow our heads and thank, him, the greatest architect for our blessings today.\n" +
                       "The crowd bows their heads as the priest prays for good and plenty.\n"+
                       "\"May the great architect of the universe watch over our efforts. May he bless our work and nourish us with his wine and water, his grain and stock, his plums and apples.\n" +
                       "May he help us patch every torn cloth, fix every splintered tool, and hew every stone. And may we all after our six days of labor, find a day of 'relief'.";
            case PartSix:
                return "You finish your meal quickly, ready to make your way into the welcoming chamber of the second level. Given to you in hushed wispers last night was the passkey: luminis.\n"+
                       "It is only given to the apprentices who were deemed ready to begin their Doric column. Upon presenting this password, you will be permitted to proceed to your work.";
            default:
                throw new Exception("Could not find valid response");
        }

    }
}
