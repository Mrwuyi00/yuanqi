package com.linwu.yuanqi.factory;

import com.linwu.yuanqi.util.Sender;

/**
 * Created by linwu on 11/6/2017.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("that is smsSender!");
    }
}
