package com.acme.basic;
import java.util.logging.Logger;

import javax.crypto.spec.PBEParameterSpec;

public class Bar {
    private static final Logger logger = Logger.getLogger(Bar.class.getName());


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
            logger.info("Loaded class: " + clazz.getName());
            logger.info("Methods:");
            for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
                logger.info(" - " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        }
    }
}
