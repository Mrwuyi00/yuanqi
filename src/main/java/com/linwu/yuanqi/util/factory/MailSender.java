package com.linwu.yuanqi.util.factory;

import com.linwu.yuanqi.util.Sender;

/**
 * Created by linwu on 11/7/2017.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("that is mailSender!");
    }
}
