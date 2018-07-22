package test;

import main.Command;
import main.Coordinates;
import main.Obstacles;
import main.Position;
import org.junit.Test;

public class MarsRoverIntegrationTest {

    @Test
    public void test_RoverMovement_BasedonSequenceOfCommands()
    {
        String command = "FF";
        char[] commandsArray = command.toCharArray();

        Position currentPosition = new Position("E",new Coordinates(1,1));
        Command performCommand = new Command();


        for(char commandReceived : commandsArray)
        {
            if(commandReceived=='F')
            {
                //Position  resultantPosition = performCommand.moveForward(currentPosition);

//                AssertEquals();

            }
        }

    }
}
