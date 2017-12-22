package com.linwu.yuanqi.produceandcomsume;

/**
 * Created by linwu on 12/8/2017.
 */
public class Test {

    public static void main(String[] args) {

        Storage storage = new Storage();

        //for (int i = 0; i < 5; i++) {

            Producer p = new Producer(storage);

            Consumer c = new Consumer(storage);

            switch (1){
                case 1:case 3:
                        p.setNum(15);
                        c.setNum(5);
                        break;

                case 2:case 4:
                        p.setNum(10);
                        c.setNum(90);
                        break;
                case 5:
                       p.setNum(80);
                       c.setNum(10);
                       break;
            }

            while (true){
                p.start();
                c.start();
            }
        //}
    }

}
