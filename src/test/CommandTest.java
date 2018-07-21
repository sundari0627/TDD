package test;

import main.Command;
import main.Coordinates;
import main.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {

    @Test
    public void forward__should_OnlyIncrementXByOne_IfDirectionIsEast() {
        Command command = new Command();

        Position startPosition = new Position(
                "E",
                new Coordinates(0, 0));

        Position endPosition = command.moveForward(startPosition);

        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }



}
