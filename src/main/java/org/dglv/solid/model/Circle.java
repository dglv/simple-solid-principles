package org.dglv.solid.model;

public record Circle(int radius) implements Shape {

    // S(circle) = Pi * pow(radius, 2)
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return 0;
    }
}
