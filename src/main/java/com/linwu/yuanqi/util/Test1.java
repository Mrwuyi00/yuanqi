package com.linwu.yuanqi.util;

import java.util.Scanner;

/**
 * Created by linwu on 8/16/2017.
 */
public class Test1 {

    //基本类型的参数传递

    public static void testBasicType(int m) {

        System.out.println("m=" + m);//m=50

        m = 100;

        System.out.println("m=" + m);//m=100

    }

    //参数为对象，不改变引用的值 ？？？？？？

    public static void add(StringBuffer s) {

        s.append("_add");

    }

    //参数为对象，改变引用的值 ？？？？？

    public static void changeRef(StringBuffer s) {
        s = new StringBuffer("Java");

    }

    public static void main(String[] args) {

        Ruiou r = new Ruiou();

        int i = 50;

        testBasicType(i);

        System.out.println(i);//i=50

        StringBuffer sMain = new StringBuffer("init");

        System.out.println("sMain=" + sMain.toString());//sMain=init

        add(sMain);

        System.out.println("sMain=" + sMain.toString());//sMain=init_add

        changeRef(sMain);

        System.out.println("sMain=" + sMain.toString());//sMain=init_add

    }

/*    Scanner s = new Scanner(System.in);
    String str = s.next();
    char[] arr = str.toCharArray();
        if(str.length() == 1){
        System.out.print(1);
    }else if(str){
        System.out.print(0);
    }else {
        System.out.print(2);
    }*/

}
