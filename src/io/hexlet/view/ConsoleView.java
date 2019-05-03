package io.hexlet.view;


import io.hexlet.controllers.CurrentMoveController;
import io.hexlet.controllers.MoveController;
import io.hexlet.controllers.WinnerController;
import io.hexlet.model.Field;
import io.hexlet.model.Figure;
import io.hexlet.model.Game;
import io.hexlet.model.Point;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    // BEGIN (write your solution here)

    // END
    public void show(final Game game) {
        final Field field = game.getField();

        for (int a = 0; a < field.getSize(); a++) {
            if (a != 0)
                generateSeparator(fieldBuilder);
            generateLine(field, a, fieldBuilder);
        }
        System.out.println(fieldBuilder.toString());
    }

    void generateLine(final Field field,
                      final int c,
                      final StringBuilder sb) {
        // BEGIN (write your solution here)

        // END
    }

    void generateSeparator(final StringBuilder sb) {
        // BEGIN (write your solution here)

        // END
    }

    public StringBuilder getFieldBuilder() {
        return fieldBuilder;
    }
}
