package com.zxxk.ext.observerpatterndemo.service.subject;

/**
 * Description: 通知者接口
 * Created by: Ext
 * Created at: 2016/3/3
 */
public interface Subject {

    void notifyChanged();

    void setSubjectState(String state);

    String getSubjectState();
}
