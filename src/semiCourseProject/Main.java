package semiCourseProject;

import semiCourseProject.model.Field;
import semiCourseProject.model.Figure;
import semiCourseProject.service.FieldService;
import semiCourseProject.service.GameService;

public class Main {
    private static final Figure[][] fieldFull = {
            {Figure.O, Figure.X, Figure.X},
            {Figure.O, Figure.O, Figure.X},
            {Figure.O, null, Figure.O},
    };
    public static void main(String[] args) {

        Field field = new Field(fieldFull);

        FieldService fieldService = new FieldService();
        System.out.println(fieldService.isFull(field));

        field.setField(fieldFull);
        fieldService.draw(field);
    }
}
