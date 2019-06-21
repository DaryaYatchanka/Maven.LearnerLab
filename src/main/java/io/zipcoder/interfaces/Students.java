package io.zipcoder.interfaces;

public class Students {
    private static Students ourInstance = new Students();

    public static Students getInstance() {
        return ourInstance;
    }

    private Students() {
    }
}
