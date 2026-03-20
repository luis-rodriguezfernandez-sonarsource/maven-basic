package com.acme.basic;

import javax.crypto.spec.PBEParameterSpec;

public class Bar {

    public void barMethod() {
        System.out.println("Bar");
    }

    public void hash() {
        byte[] salt = "salty".getBytes();
        PBEParameterSpec cipherSpec = new PBEParameterSpec(salt, 10000); // Noncompliant
    }
}
