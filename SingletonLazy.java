package com.dev30plus;

public class SingletonLazy {

    private static SingletonLazy someObject;
    //inne pola

    private SingletonLazy(){

    }

    public synchronized static SingletonLazy getInstance(){
        if (someObject == null){
            someObject = new SingletonLazy();
        }

        return someObject;
    }

    //inne metody
}
