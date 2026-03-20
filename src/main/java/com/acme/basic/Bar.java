package com.acme.basic;
import java.util.logging.Logger;

public class Bar {
    private static final Logger logger = Logger.getLogger(Bar.class.getName());


    public void barMethod() {
        System.out.println("Bar");
    }

    public void hash() {
        // No-op: removed unused local variables and hardcoded salt
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
}
