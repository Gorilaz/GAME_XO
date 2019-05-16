package io.hexlet.model.exceptions;

import io.hexlet.model.Field;
import io.hexlet.model.Point;

public class InvalidPointException extends AbstractXOException {

    public InvalidPointException(final Point point, final Field field){

        super("Point can't be \'.x= "
                + point.getX()
                + "\' & \'.y= "
                + point.getY()
                + "\' Point must be between \'0\' and \'"
                + field.getSize()
                + "\' inclusive!");
    }
}
