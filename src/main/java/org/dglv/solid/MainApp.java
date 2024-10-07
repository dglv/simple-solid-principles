package org.dglv.solid;

import org.dglv.solid.model.Circle;
import org.dglv.solid.model.Square;
import org.dglv.solid.utils.AreaCalculator;
import org.dglv.solid.utils.ShapePrinter;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);

        double sum = AreaCalculator.sum(shapes);
        String json = ShapePrinter.json(sum);
        String csv = ShapePrinter.csv(sum);

        System.out.printf("sum = %.3f\n", sum);
        System.out.println(json);
        System.out.println(csv);
    }
}