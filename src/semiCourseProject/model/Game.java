package semiCourseProject.model;

public class Game {
    private Field field;
    private Player player1;
    private Player player2;

    public Game(Field field, Player player1, Player player2) {
        this.field = field;
        this.player1 = player1;
        this.player2 = player2;
    }
}
