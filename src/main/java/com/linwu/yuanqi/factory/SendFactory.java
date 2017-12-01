package com.linwu.yuanqi.factory;


/**
 * Created by linwu on 11/7/2017.
 */
public class SendFactory {

    public Sender produce(String type){
        if("mail".equals("type")){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    public static Sender produceStaticMail(){
        return new MailSender();
    }

    public static Sender produceStaticSms(){
        return new SmsSender();
    }



}
