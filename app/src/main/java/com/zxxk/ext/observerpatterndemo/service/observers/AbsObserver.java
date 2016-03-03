package com.zxxk.ext.observerpatterndemo.service.observers;

import com.zxxk.ext.observerpatterndemo.service.subject.AbsSubject;

/**
 * Description: 抽象观察者
 * Created by: Ext
 * Created at: 2016/3/3
 */
public abstract class AbsObserver implements ObserverI {

    protected String name;
    protected AbsSubject sub;

    public AbsObserver() {
    }

    public AbsObserver(String name, AbsSubject sub) {
        this.name = name;
        this.sub = sub;
    }

}
