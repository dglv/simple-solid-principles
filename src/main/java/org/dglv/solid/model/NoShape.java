package org.dglv.solid.model;

// Liskov Substitution Principle (LSP) is broken!
// We are not able to replace derived class by its interface as we get exception right away here.
public record NoShape() implements Shape {

    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
