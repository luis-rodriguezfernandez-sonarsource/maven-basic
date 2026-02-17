package com.acme.basic;

public class Foo {

    public void fooMethod() {
        System.out.println("Foo");
        System.out.println("Foo");

	System.out.println("Foo");
        System.out.println("Foo");

	System.out.println("Bar");
        System.out.println("Bar");
    }

    public void Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant, this is true only if a == b
    }


}
