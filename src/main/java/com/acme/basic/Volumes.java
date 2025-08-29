package com.acme.basic;

public class Volumes {

    void doSomething() {
        // TODO
    }

    private int clientId = 12345; // Example client ID

    /*
    public static double rectangularPrism(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Length, width, and height cannot be negative");
        }
        return length * width * height;
    }
    */

    void doSomethingElse() {
        // TODO
    }

    private int customerId = 123456; // Example client ID

    /*
    public static double rectangularPrism(double length, double width, double height) {
        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Length, width, and height cannot be negative");
        }
        return length * width * height;
    }
    */

    /*
public static double rectangularPrism(double length, double width, double height) {
    if (length < 0 || width < 0 || height < 0) {
        throw new IllegalArgumentException("Length, width, and height cannot be negative");
    }
    return length * width * height;
}
*/
    public static double cube(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return Math.pow(side, 3);
    }

    public static double sphere(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double cylinder(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Radius and height cannot be negative");
        }
        return Math.PI * Math.pow(radius, 2) * height;
    }
}