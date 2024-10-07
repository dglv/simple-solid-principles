package org.dglv.solid.utils;

import org.dglv.solid.model.Cube;
import org.dglv.solid.model.Shape;

import java.util.List;

// Dependency Inversion Principle (DIP) is broken!
// Components should depend on abstractions, not on concretions. If another figure than cube appears
// the calculator won`t be able to process volume of the new figure.
public record VolumeCalculator () {

    public double sum(List<Cube> cubes) {
        return cubes.stream()
                .mapToDouble(Shape::area)
                .sum();
    }
}

