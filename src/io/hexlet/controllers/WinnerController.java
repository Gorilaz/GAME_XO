package io.hexlet.controllers;

import io.hexlet.model.Field;
import io.hexlet.model.Point;

public class WinnerController {

    private String checkRows(Field field) {

        int sizeField;
        sizeField = field.getSize() ;

        for (int i=0;i<sizeField;i++) {

            for (int j=0;j<sizeField;j++) {

                if (j == sizeField - 1) {
                        return  field.getFigure(new Point(i,j));
                }

                if ( field.getFigure(new Point(i,j+1)) == null || field.getFigure(new Point(i,j)) == null) {
                    break;
                }
                if (field.getFigure(new Point(i, j + 1)).equals(field.getFigure(new Point(i, j)))) {
                    if (j + 1 == sizeField) {
                        return field.getFigure(new Point(i, j));
                    }
                }
                else {
                    break;
                }

            }
        }

        return null;
    }

    private String checkColumns(Field field) {
        int sizeField;
        sizeField = field.getSize() ;

        for (int j=0;j<sizeField;j++) {

            for (int i=0;i<sizeField;i++) {

                if (i == sizeField - 1) {
                    return  field.getFigure(new Point(i,j));
                }

                if ( field.getFigure(new Point(i+1,j)) == null || field.getFigure(new Point(i,j)) == null ) {
                    break;
                }
                if (field.getFigure(new Point(i + 1, j)).equals(field.getFigure(new Point(i, j)))) {
                    if (i + 1 == sizeField) {
                        return field.getFigure(new Point(i, j));
                    }
                }
                else {
                    break;
                }

            }
        }

        return null;
    }

    private String checkLeftRightDiagonal(Field field) {

        for (int i=0; i<field.getSize();i++) {

            if (i==field.getSize() - 1) {
                return field.getFigure(new Point(i,i));
            }
            if (field.getFigure(new Point(i,i)) == null || field.getFigure(new Point(i+1,i+1)) == null ){
                break;
            }
            if (!field.getFigure(new Point(i,i)).equals(field.getFigure(new Point(i+1,i+1)))) {
                break;
            }
        }
        return null;
    }

    private String checkRightLeftDiagonal(Field field) {

        int sizeField;
        sizeField = field.getSize() - 1;

        for (int i=0; i<field.getSize();i++) {

            if (i==sizeField) {
                return field.getFigure(new Point(i,sizeField - i));
            }
            if ( field.getFigure(new Point(i,sizeField - i)) == null || field.getFigure(new Point(i+1,sizeField-i-1)) == null ) {
                break;
            }
            if (!field.getFigure(new Point(i,sizeField - i)).equals(field.getFigure(new Point(i+1,sizeField-i-1)))) {
                break;
            }
        }
        return null;
    }

    public String getWinner(Field field) {
        String winner;
        winner = checkRows(field);
        if (winner != null) {
            return winner;
        }
        winner = checkColumns(field);
        if (winner != null) {
            return winner;
        }
        winner = checkLeftRightDiagonal(field);
        if (winner != null) {
            return winner;
        }
        winner = checkRightLeftDiagonal(field);
        if (winner != null) {
            return winner;
        }

        return null;
    }
}
