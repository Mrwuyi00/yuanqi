package com.linwu.yuanqi.produceandcomsume;

/**
 * Created by linwu on 12/8/2017.
 */
public class Consumer extends Thread{

    //每次单位消耗产品
    private int num = 0;

    //消费的仓库
    private Storage storage;

    public Consumer(Storage storage){
        this.storage = storage;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void consume(){
        storage.consume(num);
    }

    @Override
    public void run() {
        consume();
    }
}
