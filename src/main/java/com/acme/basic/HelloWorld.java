package com.acme.basic;

public class HelloWorld {

    void sayHello() {
        try {
            System.out.println("go to sleep...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
             /* Clean up whatever needs to be handled before interrupting  */
	     System.out.println("I was resting my eyes!");	
             Thread.currentThread().interrupt();	
        }
        System.out.println("Hello World!");
    }

    void notCovered() {
        System.out.println("This method is not covered by unit tests");
    }


    void notCoveredAgain() {
        System.out.println("This method is not covered by unit tests");
    }

}
