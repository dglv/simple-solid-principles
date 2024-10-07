package org.dglv.solid.model;

public record Cube(int length) implements Shape, Shape3D {

    // S(cube) = pow(length, 2)
    @Override
    public double area() {
        return Math.pow(length, 2);
    }

    // V(cube) = pow(length, 3)
    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}
