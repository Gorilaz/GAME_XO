import io.hexlet.model.Field;
import io.hexlet.controllers.*;

public class Main {

    public static void main(String[] args) {

        Field field = new Field();
       // String result;
        WinnerController winControl = new WinnerController();
        field.initField("X", "X","X",
                "O","O","O",
                "X","O","X");
        assert (winControl.getWinner(field).equals("X"));

        Field field1 = new Field();
        field1.initField("O", "O","X",
                "O","X","O",
                "X","X","X");

        assert (winControl.getWinner(field1).equals("X"));

        field1.initField("O", "O","X",
                "X","X","O",
                "O","X","O");

        assert (winControl.getWinner(field1)==null);

        field1.initField("O", "O","X",
                "O","O","X",
                "O","X","O");

        assert (winControl.getWinner(field1).equals("O"));

        field1.initField("O", "O","X",
                "X","O","X",
                "O","X","X");

        assert (winControl.getWinner(field1).equals("X"));

        field1.initField("O", "O","X",
                "X","O","X",
                "O","X","O");

        assert (winControl.getWinner(field1).equals("O"));

        field1.initField("O", "O","X",
                "X","X","O",
                "X","X","O");

        assert (winControl.getWinner(field1).equals("X"));

        field1.initField("X", "O","X",
                "X","O","O",
                "O","X","X");

        assert (winControl.getWinner(field1)==null);

        field1.initField("null", "O","X",
                "X","O","O",
                "O","X","X");

        assert (winControl.getWinner(field1)==null);


    }
}
