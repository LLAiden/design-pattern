package com.llaiden.designpattern;

/**
 * 迭代器模式,jdk中的集合就是使用的这个模式
 */
public class Main {

    public static void main(String[] args) {
        LetterList letterList = new LetterList();
        Iterator iterator = letterList.getIterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
