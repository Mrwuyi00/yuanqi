package com.linwu.yuanqi.singleton;

import java.util.Vector;

/**
 * Created by linwu on 11/8/2017.
 */
public class SingleCopyTest {

    private static SingleCopyTest instance = null;

    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingleCopyTest(){}

    private static synchronized void syncInit(){
        if(instance == null){
            instance = new SingleCopyTest();
        }
    }

    public static SingleCopyTest getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        SingleCopyTest shadow = new SingleCopyTest();
        properties = shadow.getProperties();
    }
}
