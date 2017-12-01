package com.linwu.yuanqi.factory;

/**
 * Created by linwu on 11/7/2017.
 */
public class SenderMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
