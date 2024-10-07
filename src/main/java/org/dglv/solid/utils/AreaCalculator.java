package org.dglv.solid.utils;

import org.dglv.solid.model.Circle;
import org.dglv.solid.model.Square;

import java.util.List;

/*
    Single Responsibility Principle (SRP) is broken!
    Too many purposes in a single class. Class name is Area Calculator, but it does sum calculation as well as
    provides pretty formatting in various formats (json, csv).
 */
public class AreaCalculator {
    public double sum(List<Object> shapes) {
        double sum = 0;

        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                // S(circle) = Pi * pow(radius, 2)
                sum += Math.PI * Math.pow(((Circle) shape).radius(), 2);
            } else if (shape instanceof Square) {
                // S(square) = pow(length, 2)
                sum += Math.pow(((Square) shape).length(), 2);
            } else {
                throw new IllegalStateException("Not supported shape: " + shape);
            }
        }

        return sum;
    }

    // This method should be moved to its own class.
    public String json(List<Object> shapes) {
        return "{sum: %.3f}".formatted(sum(shapes));
    }

    // This method should be moved to its own class as well.
    public String csv(List<Object> shapes) {
        return "sum, %.3f".formatted(sum(shapes));
    }
}
