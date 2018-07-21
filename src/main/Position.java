package main;

public class Position {

    private String directionFacing;
    private Coordinates coordinates;

    public Position(String directionFacing, Coordinates coordinates) {
        this.directionFacing = directionFacing;
        this.coordinates = coordinates;
    }

    public String getDirectionFacing() {
        return directionFacing;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
