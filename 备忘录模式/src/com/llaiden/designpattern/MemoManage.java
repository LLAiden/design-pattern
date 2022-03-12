package com.llaiden.designpattern;

import java.util.ArrayList;
import java.util.List;

public class MemoManage {
    List<Memo> memoList = new ArrayList<>();

    public void add(Memo memo) {
        memoList.add(memo);
    }

    public Memo get(int index) {
        return memoList.get(index);
    }

    public void stateProcess() {
        for (Memo memo : memoList) {
            System.out.println(memo);
        }
    }
}
