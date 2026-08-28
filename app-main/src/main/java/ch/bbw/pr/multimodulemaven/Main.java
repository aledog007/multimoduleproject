package ch.bbw.pr.multimodulemaven;

import ch.bbw.pr.greeter.Greeter;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println("Main.main: " + greeter.greet("BBW"));
    }
}