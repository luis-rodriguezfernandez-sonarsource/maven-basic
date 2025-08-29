package com.acme.basic;

public class Fluids {

    /**
     * Calculates the density of a sample at constant density: density = mass / volume
     * @param mass mass of the sample (kg)
     * @param volume volume of the sample (m^3)
     * @return density (kg/m^3)
     */
    public static double density(double mass, double volume) {
        if (mass < 0) {
            throw new IllegalArgumentException("Mass cannot be negative");
        }
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume must be positive");
        }
        return mass / volume;
    }

    /**
     * Calculates the pressure: pressure = force / area
     * @param force force applied (N)
     * @param area area over which the force is applied (m^2)
     * @return pressure (Pa)
     */
    public static double pressure(double force, double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Area must be positive");
        }
        return force / area;
    }

    /**
     * Calculates the absolute pressure: absolutePressure = atmosphericPressure + gaugePressure
     * @param atmosphericPressure atmospheric pressure (Pa)
     * @param gaugePressure gauge pressure (Pa)
     * @return absolute pressure (Pa)
     */
    public static double absolutePressure(double atmosphericPressure, double gaugePressure) {
        return atmosphericPressure + gaugePressure;
    }
}