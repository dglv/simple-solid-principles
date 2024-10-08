package org.dglv.solid;

import org.dglv.solid.model.Circle;
import org.dglv.solid.model.Cube;
import org.dglv.solid.model.Shape;
import org.dglv.solid.model.Shape3D;
import org.dglv.solid.model.Square;
import org.dglv.solid.utils.AreaCalculator;
import org.dglv.solid.utils.ShapePrinter;
import org.dglv.solid.utils.VolumeCalculator;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Square square = new Square(10, 20);
        Cube cube = new Cube(10);

        List<Shape> shapes = List.of(circle, square, cube);
        List<Shape3D> shapes3d = List.of(cube);

        double sum = AreaCalculator.sum(shapes);
        String json = ShapePrinter.json(sum);
        String csv = ShapePrinter.csv(sum);

        System.out.printf("sum = %.3f\n", sum);
        System.out.println(json);
        System.out.println(csv);

        double sum3d = VolumeCalculator.sum(shapes3d);

        System.out.printf("sum3d = %.3f\n", sum3d);
    }
}