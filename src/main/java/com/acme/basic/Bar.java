package com.acme.basic;
import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;
import java.util.logging.Logger;

public class Bar {
    private static final SecureRandom sr = new SecureRandom();
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
            logger.warning("Class not found: " + className);
        }
    }

    public int generator() {
        return sr.nextInt(32);
    }
}
