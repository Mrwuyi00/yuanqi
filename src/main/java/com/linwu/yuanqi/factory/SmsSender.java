package com.linwu.yuanqi.factory;


/**
 * Created by linwu on 11/6/2017.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("that is smsSender!");
    }
}
