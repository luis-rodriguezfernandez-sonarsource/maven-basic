package com.acme.basic;

import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class AreaCalculator {

    public double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    public double calculateSquareArea(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return side * side;
    }

    public double calculateTriangleArea(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height cannot be negative");
        }
        return 0.5 * base * height;
    }

    public double calculateHexagonArea(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    /**
     * @param majorRadius
     * @param minorRadius
     * @return
     */
    public double calculateToroidArea(double majorRadius, double minorRadius) {
        if (majorRadius <= 0 || minorRadius <= 0) {
            throw new IllegalArgumentException("Major and minor radii must be positive");
        }
        return 4 * Math.PI * Math.PI * majorRadius * minorRadius;
    }

    Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant, this is true only if a == b
    }

    Boolean isSameReference(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant, because misleading
    }

    public double calculateHeptagonArea(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        return (7.0 / 4.0) * side * side * (1.0 / Math.tan(Math.PI / 7.0));
    }

    @Nonnull
    private String primary;
    private String secondary;

    public void foo(String color) {
        if (color != null) {
            secondary = null;
        }
        primary = color;  // Noncompliant; "primary" is Nonnull but could be set to null here
    }

    @Nonnull
    public String indirectMix() {
        String mix = null;
        return mix;  // Noncompliant; return value is Nonnull, but null is returned.
    }


}