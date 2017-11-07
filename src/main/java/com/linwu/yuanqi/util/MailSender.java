package com.linwu.yuanqi.util;

/**
 * Created by linwu on 11/7/2017.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("that is mailSender!");
    }
}
