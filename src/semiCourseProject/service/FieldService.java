package semiCourseProject.service;

import semiCourseProject.model.Field;
import semiCourseProject.model.Figure;
import semiCourseProject.model.exception.AlreadyOccupiedException;
import semiCourseProject.model.exception.MoveOutOfBoundsException;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FieldService {

    public Figure getNextFigure(Field field) {
        long countO = countElements(field.getField(), Figure.O);
        long countX = countElements(field.getField(), Figure.X);
        if (countO > countX) {
            return Figure.X;
        }
        return Figure.O;
    }

    public void makeMove(Field field, int x, int y) throws MoveOutOfBoundsException, AlreadyOccupiedException {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            throw new MoveOutOfBoundsException();
        }
        if (field.getField()[x][y] != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(x, y, getNextFigure(field));
    }

    public boolean isFull(Field field) {
        return countElements(field.getField(), null) == 0;
    }

    public void draw(Field field) {
//        IntStream.range(0, 3)
//                .forEach(i -> {
//                    IntStream.range(0, 3)
//                            .forEach(j -> System.out.print(field.getField()[i][j] + " "));
//                    System.out.println();
//                });
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField()[0].length; j++) {
                System.out.print(field.getField()[i][j] + " ");
            }
            System.out.println();
        }
    }

    private long countElements(Figure[][] array, Figure figure) {
        return Arrays.stream(array)
                .flatMap(e -> Stream.of(e)
                        .filter(el -> el == figure))
                .count();
    }
}
