package main;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.List;

public class Command {
   /* public Position moveForward(Position startPosition) {

        if (startPosition.getCoordinates().getX() == startPosition.getMaxCoordinates().getX()) {
            return new Position(
                    startPosition.getDirectionFacing(),
                    new Coordinates(
                            0,
                            0
                    )
            );
        }

        return new Position(
                startPosition.getDirectionFacing(),
                new Coordinates(
                        startPosition.getCoordinates().getX() + 1,
                        startPosition.getCoordinates().getY()
                )
        );
    }
*/


    public Position moveForward(Position startPosition,List<Obstacles> ObstacleLIst) {

        Position resPosition = startPosition;


        if (startPosition.getCoordinates().getX() == startPosition.getMaxCoordinates().getX()) {
            return new Position(
                    startPosition.getDirectionFacing(),
                    new Coordinates(
                            0,
                            0
                    )
            );


        }
        else {

            if (startPosition.getDirectionFacing() == "N") {
                resPosition = new Position(
                        startPosition.getDirectionFacing(),
                        new Coordinates(
                                startPosition.getCoordinates().getX(),
                                startPosition.getCoordinates().getY() + 1
                        )
                );
                for (Obstacles obstacle : ObstacleLIst) {

                    if ((resPosition.getCoordinates().getX() == obstacle.getX()) &&
                            (resPosition.getCoordinates().getY() == obstacle.getY())) {
                        resPosition = startPosition;
                    }
                }
                return resPosition;


            } else if (startPosition.getDirectionFacing() == "S") {
                resPosition = new Position(
                        startPosition.getDirectionFacing(),
                        new Coordinates(
                                startPosition.getCoordinates().getX(),
                                startPosition.getCoordinates().getY() - 1
                        )
                );
                for (Obstacles obstacle : ObstacleLIst) {

                    if ((resPosition.getCoordinates().getX() == obstacle.getX()) &&
                            (resPosition.getCoordinates().getY() == obstacle.getY())) {
                        resPosition = startPosition;
                    }
                }
                return resPosition;


            }


        }

        return resPosition;
    }



    public Position moveBackward(Position currentPositon) {

        return new Position(
          currentPositon.getDirectionFacing(),
          new Coordinates(currentPositon.getCoordinates().getX(),
                  currentPositon.getCoordinates().getY()-1)
        );
    }

    public Position turnLeft(Position currentPositon) {

        Position resPosition = new Position(currentPositon.getDirectionFacing(),
                currentPositon.getCoordinates());


        if(currentPositon.getDirectionFacing()=="E")
        {
            resPosition.setDirection("N");
        }
        else if(currentPositon.getDirectionFacing()=="W")
        {
            resPosition.setDirection("S");

        }
        else if(currentPositon.getDirectionFacing()=="S")
        {
            resPosition.setDirection("E");

        }
        else{
            resPosition.setDirection("W");

        }
        return resPosition;

    }

    public Position turnRight(Position currentPosition) {
        Position resPosition = new Position(currentPosition.getDirectionFacing(),
                currentPosition.getCoordinates());

        if(currentPosition.getDirectionFacing()=="E")
        {
            resPosition.setDirection("S");
        }
        else if(currentPosition.getDirectionFacing()=="W")
        {
            resPosition.setDirection("N");
        }
        else if(currentPosition.getDirectionFacing()=="S")
        {
            resPosition.setDirection("W");
        }
        else{
            resPosition.setDirection("E");

        }
        return resPosition;


    }
}