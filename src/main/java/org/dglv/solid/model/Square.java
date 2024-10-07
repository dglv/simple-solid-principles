package org.dglv.solid.model;

public record Square(int lengthA, int lengthB) implements Shape {

    // S(square) = lengthA * lengthB
    @Override
    public double area() {
        return lengthA * lengthB;
    }

    @Override
    public double volume() {
        return 0;
    }
}
