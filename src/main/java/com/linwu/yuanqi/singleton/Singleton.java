package com.linwu.yuanqi.singleton;

/**
 * Created by linwu on 11/7/2017.
 */
public class Singleton {

    /*持有私有静态实例，防止被引用，此处赋值为null,目的是实现延迟加载*/

    private Singleton() {

    }

    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }

    public Object readResolve(){
        return getInstance();
    }


}
