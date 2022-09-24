package com.sda.javaoop.oop;

public interface Workable {

    public static String interfaceName = "Workable";

    public boolean doWork();

    public default void printInterfaceName() {
        System.out.println("Default method of " + interfaceName + " interface invoked.");
    }

    static int getInt() {
        return 1;
    }

    private static long getLong() {
        return 1L;
    }

    private double getDouble() {
        return 1.0;
    }

}
