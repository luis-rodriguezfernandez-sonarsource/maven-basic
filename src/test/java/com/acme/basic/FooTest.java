package com.acme.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void testIsSameNumberValueWithSameValue() {
        AtomicLong a = new AtomicLong(42);
        AtomicLong b = new AtomicLong(42);
        Foo foo = new Foo();
        assertTrue(foo.isSameNumberValue(a, a));
        assertFalse(foo.isSameNumberValue(a, b));
    }

    @Test
    void testIsSameNumberValueWithDifferentValues() {
        AtomicLong a = new AtomicLong(1);
        AtomicLong b = new AtomicLong(2);
        Foo foo = new Foo();
        assertFalse(foo.isSameNumberValue(a, b));
    }

    @Test
    void testFooMethodOutput() {
        Foo foo = new Foo();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            foo.fooMethod();
        } finally {
            System.setOut(originalOut);
        }
        String expected = "Foo\nFoo\nFoo\nFoo\nBar\nBar\n";
        assertEquals(expected, outContent.toString());
    }
}
