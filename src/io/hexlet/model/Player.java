package io.hexlet.model;

public class Player {

    private final String name;

    private final String figure;

    Player(final PlayerBuilder playerBuilder){
        this.name = playerBuilder.getName();
        this.figure = playerBuilder.getFigure();
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }

    public class PlayerBuilder{
        private String name;

        private String figure;

        public String getName() {
            return name;
        }

        public String getFigure() {
            return figure;
        }

        public PlayerBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public PlayerBuilder figure(final String figure) {
            this.figure = figure;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

}
