package com.llaiden.designpattern;


/**
 * 策略模式
 *     如果需要对原有逻辑进行修改只需要新增对应策略,
 *     类遵循开闭原则对修改关闭对扩展开放
 */
public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.work();
        //买了小电炉
        worker.setTrafficTool(new LittleElectricDonkey());
        worker.work();

        worker.setTrafficTool(new Motorcycle());
        worker.work();
    }
}
