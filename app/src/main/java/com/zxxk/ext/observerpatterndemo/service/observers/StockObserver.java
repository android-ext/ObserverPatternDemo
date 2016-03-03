package com.zxxk.ext.observerpatterndemo.service.observers;

import android.util.Log;

import com.zxxk.ext.observerpatterndemo.service.subject.AbsSubject;

/**
 * Description: 看玩股票的观察者
 * Created by: Ext
 * Created at: 2016/3/3
 */
public class StockObserver extends AbsObserver {

    public StockObserver() {
        super();
    }

    public StockObserver(String name, AbsSubject sub) {
        super(name, sub);
    }

    @Override
    public void update(Object object) {

        Log.i(getClass().getName(), object.toString() + " " + name);
    }
}
