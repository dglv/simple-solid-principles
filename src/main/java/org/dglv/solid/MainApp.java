package org.dglv.solid;

import org.dglv.solid.model.Circle;
import org.dglv.solid.model.Square;
import org.dglv.solid.utils.AreaCalculator;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);

        double sum = areaCalculator.sum(shapes);

        System.out.println("sum = " + sum);
    }
}