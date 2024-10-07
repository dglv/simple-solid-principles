package org.dglv.solid.model;

public record Cube(int length) implements Shape {

    // S(square) = pow(length, 2)
    @Override
    public double area() {
        return Math.pow(length, 2);
    }

    @Override
    public double volume() {
        return 0;
    }
}
