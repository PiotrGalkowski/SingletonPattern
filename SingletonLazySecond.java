package com.dev30plus;

public class SingletonLazySecond {

    private static SingletonLazySecond someObject;
    //inne pola

    private SingletonLazySecond(){

    }

    public static SingletonLazySecond getInstance(){
        if (someObject == null){
            synchronized (SingletonLazySecond.class){
                if (someObject == null){
                    someObject = new SingletonLazySecond();
                }
            }
        }
        return someObject;
    }

    //inne metody
}
