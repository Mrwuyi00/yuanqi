package com.linwu.yuanqi.threadtest;

import com.linwu.yuanqi.util.DateFormatUtility;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by linwu on 11/8/2017.
 */
public class ThreadTemplateTest extends TheradTest {

    private Object o;

    public ThreadTemplateTest(Object o){
        this.o = o;
    }

    public ThreadTemplateTest(){
    }

    @Override
    public void run() {
        while(true){
            System.out.println(
                    DateFormatUtility.parseExchangeRateServiceDate(new Date()) +
                            " "+
                            Thread.currentThread().getName()+
                            " done"
            );
            try {
                //线程休眠时间1-5秒
                Thread.sleep(1000 * (new Random().nextInt(5)+1));
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
