package com.example.ayush.singletondemo;

class Singleton {

    private static Singleton sInstance = null;

    private String sString;

    private Singleton() {
        sString = "Hello";
    }

    static Singleton getInstance() {
        if (sInstance == null) {
            sInstance = new Singleton();
        }
        return sInstance;
    }

    public String getString() {
        return this.sString;
    }

    public void setString(String value) {
        sString = value;
    }
}
