package test;

import main.Command;
import main.Coordinates;
import main.Obstacles;
import main.Position;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    private Command command;
    private   Position currentPosition;
    private  List<Obstacles> ObstaclesList;

    @Before
    public void setUp()
    {
        command = new Command();
        currentPosition = new Position("N",new Coordinates(1,1));
        currentPosition.setMaxCoordinates(new Coordinates(10,10));
        ObstaclesList = new ArrayList<Obstacles>();
        ObstaclesList.add(new Obstacles(2,2));
        ObstaclesList.add(new Obstacles(1,3));

    }

    @Test
    public void moveOneUnitForward_whenCommandIsForward_roverFacingNorth() {

        currentPosition.setDirection("N");
        Position endPosition = command.moveForward(currentPosition,ObstaclesList);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(2, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveOneUnitBackward_whenCommandIsForward_roverFacingSouth() {

        currentPosition.setDirection("S");
        Position endPosition = command.moveForward(currentPosition,ObstaclesList);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());
    }

    @Test
    public void moveOneUnitBackward_whenCommandIsBackward() {

        Position endPosition = command.moveBackward(currentPosition);

        assertEquals(1, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnNorth_whenCommandIsLeft_AndIfDirectionIsEast() {
        Command command = new Command();
        Position currentPosition = new Position("E",new Coordinates(0,0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("N", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnWest_whenCommandIsLeft_AndIfDirectionIsNorth() {
        Command command = new Command();
        Position currentPosition = new Position("N",new Coordinates(0,0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("W", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnEast_whenCommandIsLeft_AndIfDirectionIsSouth() {
        Command command = new Command();
        Position currentPosition = new Position("S",new Coordinates(0,0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }



    @Test
    public void turnSouth_whenCommandIsLeft_AndIfDirectionIsWest() {
        Command command = new Command();
        Position currentPosition = new Position("W",new Coordinates(0,0));

        Position endPosition = command.turnLeft(currentPosition);
        assertEquals("S", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }



    @Test
    public void turnSouth_whenCommandIsRight_AndIfDirectionIsEast() {
        Command command = new Command();
        Position currentPosition = new Position("E",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("S", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnNorth_whenCommandIsRight_AndIfDirectionIsWest() {
        Command command = new Command();
        Position currentPosition = new Position("W",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("N", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnWest_whenCommandIsRight_AndIfDirectionIsSouth() {
        Command command = new Command();
        Position currentPosition = new Position("S",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("W", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void turnEast_whenCommandIsRight_AndIfDirectionIsNorth() {
        Command command = new Command();
        Position currentPosition = new Position("N",new Coordinates(0,0));

        Position endPosition = command.turnRight(currentPosition);
        assertEquals("E", endPosition.getDirectionFacing());
        assertEquals(0, endPosition.getCoordinates().getX());
        assertEquals(0, endPosition.getCoordinates().getY());

    }

    @Test
    public void testWrapping_whenRoverHasReachedMaxLocation()
    {

        Command command = new Command();
        Position currentPosition = new Position("N",new Coordinates(10,10));
        currentPosition.setMaxCoordinates(new Coordinates(10,10));

        Position resPosition = command.moveForward(currentPosition,ObstaclesList);
        assertEquals(0, resPosition.getCoordinates().getX());
        assertEquals(0,resPosition.getCoordinates().getY());

    }

    @Test
    public void testRoverReceivedForwardCommand_andObstacleIsFound()
    {
        Position currentPosition = new Position("N",new Coordinates(1,2));

        currentPosition.setMaxCoordinates(new Coordinates(10,10));

        Position resPosition =  command.moveForward(currentPosition,ObstaclesList);

        assertEquals(1, resPosition.getCoordinates().getX());
        assertEquals(2,resPosition.getCoordinates().getY());

    }

   /* @Test
    public void testRoverReceivedBackwardCommand_andObstacleIsFoundßß()
    {

        Position resPosition =  command.moveForward(currentPosition,ObstaclesList);

        assertEquals(1, resPosition.getCoordinates().getX());
        assertEquals(1,resPosition.getCoordinates().getY());

    }*/
}
