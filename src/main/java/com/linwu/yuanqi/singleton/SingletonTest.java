package com.linwu.yuanqi.singleton;

/**
 * Created by linwu on 11/8/2017.
 */
public class SingletonTest {

    private static SingletonTest instance = null;

    private SingletonTest(){}

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

}
