package com.linwu.yuanqi.factory;

/**
 * Created by linwu on 11/7/2017.
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();

        Sender sender = factory.produce("sms");

        sender.send();

        Sender sender1 = factory.produceMail();

        sender1.send();

        Sender sender2 = SendFactory.produceStaticMail();

        sender2.send();

        Provider provider = new SenderMailFactory();

        Sender sender3 = provider.produce();

        sender3.send();
    }

}
