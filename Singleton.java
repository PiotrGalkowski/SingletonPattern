package com.dev30plus;

//Singleton tworzony po uruchomieniu aplikacji
public class Singleton {

    private static Singleton someObject = new Singleton();
    //inne pola

    private Singleton(){

    }

    public static Singleton getInstance(){
        return someObject;
    }

    //inne metody
}
