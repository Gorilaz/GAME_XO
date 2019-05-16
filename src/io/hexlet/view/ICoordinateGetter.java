package io.hexlet.view;

import io.hexlet.model.Field;
import io.hexlet.model.Point;

public interface ICoordinateGetter {

    Point getMoveCoordinate(final Field field);

}
