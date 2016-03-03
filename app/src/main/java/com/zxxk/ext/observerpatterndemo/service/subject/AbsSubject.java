package com.zxxk.ext.observerpatterndemo.service.subject;

import com.zxxk.ext.observerpatterndemo.service.observers.ObserverI;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 抽象通知者
 * Created by: Ext
 * Created at: 2016/3/3
 */
public abstract class AbsSubject implements Subject {

    /** 给子类添加一个属性 */
    protected String subjectState;
    /** 观察者集合*/
    protected List<ObserverI> mObservers;

    public AbsSubject() {

        mObservers = new ArrayList<ObserverI>();
    }

    public void attach(ObserverI observer) {
        if (null != mObservers)
            mObservers.add(observer);
    }

    public void detach(ObserverI observer) {
        if (null != mObservers && mObservers.size() > 0) {
            mObservers.remove(observer);
        }
    }

}
