package org.dglv.solid.utils;

import org.dglv.solid.model.Shape3D;

import java.util.List;

public record VolumeCalculator () {

    public static double sum(List<Shape3D> shapes) {
        return shapes.stream()
                .mapToDouble(Shape3D::volume)
                .sum();
    }
}

