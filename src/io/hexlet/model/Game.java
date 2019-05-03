package io.hexlet.model;

public class Game {

    private final Player player1;

    private final Player player2;

    private final Field field;

    private final String name;

    // create the constructor
    // BEGIN (write your solution here)
    Game(final GameBuilder gameBuilder) {
        this.player1 = gameBuilder.getPlayer1();
        this.player2 = gameBuilder.getPlayer2();
        this.field = gameBuilder.getField();
        this.name = gameBuilder.getName();
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    class GameBuilder {

        private Player player1;

        private Player player2;

        private Field field;

        private String name;

        public GameBuilder player1(final Player player1) {
            this.player1 = player1;
            return this;
        }

        public GameBuilder player2(final Player player2) {
            this.player2 = player2;
            return this;
        }

        public GameBuilder field(final Field field) {
            this.field = field;
            return this;
        }

        public GameBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public Game build(GameBuilder gameBuilder) {
            return new Game(this);
        }

        public Player getPlayer1() {
            return player1;
        }

        public Player getPlayer2() {
            return player2;
        }

        public Field getField() {
            return field;
        }

        public String getName() {
            return name;
        }
    }

}

