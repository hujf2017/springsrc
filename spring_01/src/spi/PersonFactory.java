package spi;

import Interface.Person;

public class PersonFactory {
    public static Person getPerson(String arg) {
        if (arg.equalsIgnoreCase("Chinese")) {
            return new Chinese();
        } else {
            return new American();
        }
    }
}