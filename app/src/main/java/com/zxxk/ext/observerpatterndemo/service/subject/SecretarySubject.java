package com.zxxk.ext.observerpatterndemo.service.subject;

import com.zxxk.ext.observerpatterndemo.service.observers.ObserverI;

/**
 * Description: 秘书通知者
 * Created by: Ext
 * Created at: 2016/3/3
 */
public class SecretarySubject extends AbsSubject {

    @Override
    public void notifyChanged() {

        for (ObserverI observer : mObservers) {
            observer.update(getSubjectState());
        }
    }

    @Override
    public void setSubjectState(String state) {
        subjectState = state;
    }

    @Override
    public String getSubjectState() {
        return subjectState;
    }
}
