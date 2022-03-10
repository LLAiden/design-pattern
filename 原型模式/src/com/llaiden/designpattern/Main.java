package com.llaiden.designpattern;


/**
 * 原型模式
 * 1.实现Cloneable标志接口
 * 2.重写object中clone类
 * 3.其中的引用数据类型将会被共享 ->需要深copy需要把这个对象拎出来另外clone
 * 达到基本数据类型和常量的值copy且对象不相等
 */
public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge("20");
        worker.setGender("男");
        worker.setName("Aiden");
        worker.setSalary("1000");
        CloneTest cloneTest = new CloneTest();
        cloneTest.setI(110);
        worker.setCloneTest(cloneTest);
        System.out.println(worker);
        System.out.println(worker.hashCode());
        System.out.println(worker.getCloneTest().hashCode());

        Worker cloneWorker = worker.clone();
        System.out.println(cloneWorker);
        System.out.println(cloneWorker.hashCode());
        System.out.println(cloneWorker.getCloneTest().hashCode());
    }
}
