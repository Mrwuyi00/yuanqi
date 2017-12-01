package com.linwu.yuanqi.threadtest;

import com.linwu.yuanqi.util.DateFormatUtility;

import java.util.Date;
import java.util.Random;

/**
 * Created by linwu on 11/8/2017.
 */
public class UsersJunit extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    DateFormatUtility.parseExchangeRateServiceDate(new Date()) +
                            " "+
                            (i+1) +
                            " in............."
            );
            Thread thread = new ThreadSingletonTest();
            thread.setName(" user No."+(i+1));
            thread.start();
            try {
                Thread.sleep(1000*(new Random().nextInt(5)+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*public void test(){
        for (int i = 0; i < 10; i++) {
            Thread thread = new ThreadTemplateTest();
            thread.setName(" user No."+(i+1));
            thread.start();
            try {
                Thread.sleep(1000*(new Random().nextInt(5)+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/

    public static void main(String[] args) {
        new UsersJunit().run();
    }

}
