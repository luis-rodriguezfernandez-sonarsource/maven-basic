package com.acme.basic;

public class Kinematics {

    /**
     * Calculates the final velocity using the formula: v = u + a * t
     * @param initialVelocity initial velocity (u)
     * @param acceleration acceleration (a)
     * @param time time (t)
     * @return final velocity (v)
     */
    public static double finalVelocity(double initialVelocity, double acceleration, double time) {
        return initialVelocity + acceleration * time;
    }

    /**
     * Calculates the force using Newton's second law: F = m * a
     * @param mass mass (m)
     * @param acceleration acceleration (a)
     * @return force (F)
     */
    public static double newtonsSecondLaw(double mass, double acceleration) {
        if (mass < 0) {
            throw new IllegalArgumentException("Mass cannot be negative");
        }
        return mass * acceleration;
    }

    /**
     * Calculates the momentum: p = m * v
     * @param mass mass (m)
     * @param velocity velocity (v)
     * @return momentum (p)
     */
    public static double momentum(double mass, double velocity) {
        if (mass < 0) {
            throw new IllegalArgumentException("Mass cannot be negative");
        }
        return mass * velocity;
    }
}