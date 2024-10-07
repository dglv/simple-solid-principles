package org.dglv.solid.model;

// Interface Segregation Principle (ISP) is broken!
// Interfaces should not force classes to implement what they can't do.
public interface Shape {

    double area();

    // all 3D shapes must calculate volumes
    double volume();
}
