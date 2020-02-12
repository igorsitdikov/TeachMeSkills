package semiCourseProject.model;

public class Field {
    private Figure[][] field;

    public Field() {
        field = new Figure[3][3];
    }

    public Field(Figure[][] field) {
        this.field = field;
    }

    public Figure[][] getField() {
        return field;
    }

    public void setField(Figure[][] field) {
        this.field = field;
    }

    public void setFigure(int x, int y, Figure figure) {
        field[x][y] = figure;
    }

    public Figure getFigure(int x, int y) {
        return field[x][y];
    }
}
