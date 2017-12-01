package com.linwu.yuanqi.factory;



/**
 * Created by linwu on 11/7/2017.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produce("sms");

        sender.send();
    }

}
