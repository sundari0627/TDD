package main;

public class Position {

    private String directionFacing;
    private Coordinates coordinates;
    private Coordinates MaxCoordinates;

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

    public void setDirection(String direction) {
        this.directionFacing = direction;

    }

    public Coordinates getMaxCoordinates() {
        return MaxCoordinates;
    }

    public void setMaxCoordinates(Coordinates maxCoordinates) {
        MaxCoordinates = maxCoordinates;
    }
}
