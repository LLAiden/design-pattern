package com.llaiden.designpattern;

import java.util.Arrays;
import java.util.List;

public class LetterList implements IteratorContainer {

    private final List<String> list = Arrays.asList("a", "b", "c", "d");

    @Override
    public Iterator getIterator() {
        return new LetterIterator();
    }

    public class LetterIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            if (hasNext() && index < list.size()) {
                return list.get(index++);
            }
            return null;
        }
    }
}
