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

    public Point getRandom(final Field field) {
        Point randomPoint = new Point(RANDOM.nextInt(field.getSize()), RANDOM.nextInt(field.getSize()));
        while (field.getFigure(randomPoint) != null) {
            randomPoint = new Point(RANDOM.nextInt(field.getSize()), RANDOM.nextInt(field.getSize()));
        }
        return randomPoint;
    }

    public Point getMoveCoordinate(final Field field) {
        Field fieldLocal = field;
        WinnerController wc = new WinnerController();
        Point point = new Point(0,0);
        Figure winner;

        final Figure figure =  Figure.X;
        final Figure enemy = Figure.O;


        for (int i=0; i<fieldLocal.getSize(); i++) {
            for(int j=0; j<fieldLocal.getSize(); j++) {
                point = new Point(i,j);
                if (fieldLocal.getFigure(point) == null) {
                    fieldLocal.setFigure(point, figure);
                    winner = wc.getWinner(field);
                    if (winner == Figure.X) {
                        System.out.println("X - win's!");
                        fieldLocal.setFigure(point,null);
                        return point;
                    }
                    else {
                        fieldLocal.setFigure(point,null);
                    }
                }

            }
        }


        for (int i=0; i<fieldLocal.getSize(); i++) {
            for(int j=0; j<fieldLocal.getSize(); j++) {
                point = new Point(i,j);
                if (fieldLocal.getFigure(point) == null) {
                    fieldLocal.setFigure(point, enemy);
                    winner = wc.getWinner(field);
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

        point = getRandom(field);
        return point;
    }


}
