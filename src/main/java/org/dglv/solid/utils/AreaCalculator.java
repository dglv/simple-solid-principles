package org.dglv.solid.utils;

import org.dglv.solid.model.Circle;
import org.dglv.solid.model.Cube;
import org.dglv.solid.model.Square;

import java.util.List;

public final class AreaCalculator {
    private AreaCalculator() {
    }

    // Open Closed Principle (OCP) is broken!
    // We added Cube class, but now we are forced to change existing implementation of the method
    // to calculate its area sum.
    public static double sum(List<Object> shapes) {
        double sum = 0;

        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                // S(circle) = Pi * pow(radius, 2)
                sum += Math.PI * Math.pow(((Circle) shape).radius(), 2);
            } else if (shape instanceof Square) {
                // S(square) = lengthA * lengthB
                sum += ((Square)shape).lengthA() * ((Square)shape).lengthB();
            } else if (shape instanceof Cube) {
                // S(square) = pow(length, 2)
                sum += Math.pow(((Cube) shape).length(), 2);
            } else {
                throw new IllegalStateException("Not supported shape: " + shape);
            }
        }

        return sum;
    }
}
