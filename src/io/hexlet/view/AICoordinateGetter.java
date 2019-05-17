package io.hexlet.view;

import io.hexlet.controllers.MoveController;
import io.hexlet.model.Field;
import io.hexlet.model.Figure;
import io.hexlet.model.Point;
import io.hexlet.controllers.WinnerController;
import io.hexlet.model.exceptions.AlreadyOccupiedException;
import io.hexlet.model.exceptions.InvalidPointException;

import java.util.Random;

public class AICoordinateGetter implements ICoordinateGetter {
    private static final Random RANDOM = new Random();
    Figure winner;
    Point point;
    WinnerController wc = new WinnerController();

    public Point getMoveCoordinate(final Field field) {
        Field fieldLocal = field;
        final Figure figure =  Figure.X;
        final Figure enemy = Figure.O;

        chechNextMove(fieldLocal,figure);
        chechNextMove(fieldLocal,enemy);

        return new RandomCoordinateGetter().getMoveCoordinate(fieldLocal);
    }

    public Point chechNextMove(Field fieldLocal,Figure figure){
        for (int i=0; i<fieldLocal.getSize(); i++) {
            for(int j=0; j<fieldLocal.getSize(); j++) {
                point = new Point(i,j);
                if (fieldLocal.getFigure(point) == null) {
                    fieldLocal.setFigure(point, figure);
                    winner = wc.getWinner(fieldLocal);
                    if (winner == Figure.O) {
                        //System.out.println("X - win's!");
                        fieldLocal.setFigure(point,null);
                        return point;
                    }
                    else {
                        fieldLocal.setFigure(point,null);
                    }
                }
            }
        }

        return null;
    }

}
