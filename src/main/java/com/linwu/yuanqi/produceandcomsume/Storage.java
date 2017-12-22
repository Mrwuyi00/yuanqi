package com.linwu.yuanqi.produceandcomsume;

import org.apache.log4j.Logger;

import java.util.LinkedList;

/**
 * Created by linwu on 12/8/2017.
 */
public class Storage {

    private static final Logger logger = Logger.getLogger(Storage.class);

    private final int MAX_SIZE = 100;

    private LinkedList<Object> list = new LinkedList<>();

    public void produce(int num){

        //同步代码块
        synchronized (list){

            while(list.size() + num > MAX_SIZE){

                System.out.println("【要生产的产品数量】:" + num + "  【库存量】:"
                        + list.size() + "/t暂时不能执行生产任务!");

                try{
                    //由于条件不足，生产阻塞
                    list.wait();
                }catch (InterruptedException e){
                    //e.printStackTrace();
                    logger.error("由于条件不足，生产阻塞");
                }
            }

            for (int i = 0; i < num; i++) {
                list.add(new Object());
            }

            System.out.println("【已经生产产品数】：" + num + "  【现仓储量为】："+ list.size());

            list.notifyAll();

        }
    }

    public void consume(int num){

        synchronized (list){

            while(list.size() < num){

                System.out.println("【要消费的产品数量】:" + num + "  【库存量】:"
                        + list.size() + "/t暂时不能执行消费任务!");

                try{
                    //由于条件不足，消费阻塞
                    list.wait();
                }catch (InterruptedException e){
                    //e.printStackTrace();
                    logger.error("由于条件不足，消费阻塞");
                }
            }

            for (int i = 0; i < num; i++) {
                list.remove();
            }

            System.out.println("【已经消费产品数】:" + num + "  【现仓储量为】:" + list.size());

            list.notifyAll();

        }
    }

    public LinkedList<Object> getList(){
        return list;
    }

    public void setList(LinkedList<Object> list) {
        this.list = list;
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }
}
