package com.acme.basic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


public class Foo {

    Logger logger = Logger.getLogger(getClass().getName());

    public void fooMethod() {
        logger.info("Foo");
        logger.info("Foo");

        logger.info("Foo");
        logger.info("Foo");

        logger.info("Bar");
        logger.info("Bar");

        StringBuilder sb = new StringBuilder();

        if ("".equals(sb.toString())) { // Noncompliant
            System.out.println("Empty");
        }
    }

    public Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.get() == b.get();
    }

    Boolean isSameReference(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant, because misleading
    }

}
