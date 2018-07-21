package main;

public class Command {
    public Position moveForward(Position startPosition) {
        return new Position(
                startPosition.getDirectionFacing(),
                new Coordinates(
                        startPosition.getCoordinates().getX() + 1,
                        startPosition.getCoordinates().getY()
                )
        );
    }
}