package io.hexlet.model;

import java.awt.*;

public class Field {

    private Figure[][] figures = new Figure[3][3];

    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(Point point,Figure figure) {
        figures[point.getX()][point.getY()] = figure;
    }

/*
    public void showField() {

        Point point = new Point();
        for (int i = 0; i < getSize(); i++) {
            point.setX(i);

            for (int j = 0; j < getSize(); j++) {
                point.setY(j);
                System.out.print(getFigure(point.getX(),point.getY()));
            }
            System.out.println();
        }

    }

 */


}
