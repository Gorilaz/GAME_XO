package io.hexlet.model;

import java.awt.*;

public class Field {

    private String[][] figures = new String[3][3];

    public int getSize() {
        return figures.length;
    }

    public String getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void initField(String one, String two, String three, String four, String five, String six, String seven,
                                  String eight, String nine) {

        figures[0][0] = one;
        figures[0][1] = two;
        figures[0][2] = three;
        figures[1][0] = four;
        figures[1][1] = five;
        figures[1][2] = six;
        figures[2][0] = seven;
        figures[2][1] = eight;
        figures[2][2] = nine;

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
