package com.acme.basic;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.StreamHandler;
import java.util.logging.SimpleFormatter;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void testIsSameNumberValueWithSameReference() {
        AtomicLong a = new AtomicLong(42);
        Foo foo = new Foo();
        assertTrue(foo.isSameNumberValue(a, a));
    }

    @Test
    void testIsSameNumberValueWithDifferentValues() {
        AtomicLong a = new AtomicLong(1);
        AtomicLong b = new AtomicLong(2);
        Foo foo = new Foo();
        assertFalse(foo.isSameNumberValue(a, b));
    }

    @Test
    void testIsSameNumberValueWithSameValueDifferentReference() {
        AtomicLong a = new AtomicLong(42);
        AtomicLong b = new AtomicLong(42);
        Foo foo = new Foo();
        assertTrue(foo.isSameNumberValue(a, b));
    }

    @Test
    void testFooMethodLoggerOutput() {
        Foo foo = new Foo();
        ByteArrayOutputStream logContent = new ByteArrayOutputStream();
        StreamHandler handler = new StreamHandler(logContent, new SimpleFormatter());
        foo.logger.addHandler(handler);

        foo.fooMethod();
        handler.flush();

        String logOutput = logContent.toString();
        assertTrue(logOutput.contains("Foo"));
        assertTrue(logOutput.contains("Bar"));

        foo.logger.removeHandler(handler);
    }
}
