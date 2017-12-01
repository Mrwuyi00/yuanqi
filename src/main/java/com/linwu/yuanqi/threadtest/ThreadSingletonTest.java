package com.linwu.yuanqi.threadtest;

import com.linwu.yuanqi.singleton.SingletonTest;
import com.linwu.yuanqi.util.DateFormatUtility;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Date;
import java.util.Random;

/**
 * Created by linwu on 11/8/2017.
 */
public class ThreadSingletonTest extends TheradTest {

    private static int j = 1;

    @Override
    public void run() {
        while(true){
            if(null == SingletonTest.getInstance()){
                if(j != 1)
                System.out.println("generate instance");
            }
            if(null != SingletonTest.getInstance()){
                System.out.println("instance has been exist");
            }
            System.out.println(
                    DateFormatUtility.parseExchangeRateServiceDate(new Date()) +
                            " "+
                            Thread.currentThread().getName()+
                            " done"
            );
            try {
                //线程休眠时间1-5秒
                Thread.sleep(0);//1000 * (new Random().nextInt(5)+1));
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
