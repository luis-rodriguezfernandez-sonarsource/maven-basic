package com.acme.basic;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class Bar {

    public void barMethod() {
        System.out.println("Bar");
    }

    public void hash() {
        byte[] salt = "salty".getBytes();
        PBEParameterSpec cipherSpec = new PBEParameterSpec(salt, 10000); // Noncompliant
    }

    public void loadAndPrintMethods(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            System.out.println("Loaded class: " + clazz.getName());
            System.out.println("Methods:");
            for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
                System.out.println(" - " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        }
    }

    public int generator() {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(123456L); // Noncompliant
        return sr.nextInt(32);
    }
}
