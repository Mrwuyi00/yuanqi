package com.linwu.yuanqi.produceandcomsume;

/**
 * Created by linwu on 12/8/2017.
 */
public class Producer extends Thread{

    //每次生产的产品数量
    private int num = 0;

    //所在放置的仓库
    private Storage storage;

    //构造函数，设置仓库
    public Producer(Storage storage){
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

    public void produce(){
        storage.produce(num);
    }

    @Override
    public void run() {
        produce();
    }
}
