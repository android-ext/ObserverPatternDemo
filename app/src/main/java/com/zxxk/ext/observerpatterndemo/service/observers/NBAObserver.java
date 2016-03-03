package com.zxxk.ext.observerpatterndemo.service.observers;

import android.util.Log;

import com.zxxk.ext.observerpatterndemo.service.subject.AbsSubject;

/**
 * Description: 看NBA的观察者
 * Created by: Ext
 * Created at: 2016/3/3
 */
public class NBAObserver extends AbsObserver{

    public NBAObserver(String name, AbsSubject sub) {
        super(name, sub);
    }

    @Override
    public void update(Object object) {

        Log.i(getClass().getName(), object.toString() + " " + name);
    }
}
