package com.zxxk.ext.observerpatterndemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zxxk.ext.observerpatterndemo.R;
import com.zxxk.ext.observerpatterndemo.service.observers.NBAObserver;
import com.zxxk.ext.observerpatterndemo.service.observers.StockObserver;
import com.zxxk.ext.observerpatterndemo.service.subject.BossSubject;
import com.zxxk.ext.observerpatterndemo.service.subject.SecretarySubject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBossSubject();
        testSecretarySubject();
    }

    /**
     * @description: 秘书通知者测试
     * @Time: 2016/3/3 16:15
     * @param
     * @return
     */
    private void testSecretarySubject() {

        SecretarySubject secretary = new SecretarySubject();

        // 看股票的同事
        StockObserver stockObserver = new StockObserver("股票男", secretary);
        // 看NBA的同事
        NBAObserver nbaObserver = new NBAObserver("看NBA男", secretary);
        secretary.attach(stockObserver);
        secretary.attach(nbaObserver);

        secretary.setSubjectState("秘书妹子说： 老板回来了");
        secretary.notifyChanged();
    }

    /**
     * @description: 老板通知者测试
     * @Time: 2016/3/3 16:15
     * @param
     * @return
     */
    private void testBossSubject() {

        BossSubject boss = new BossSubject();

        // 看股票的同事
        StockObserver stockObserver = new StockObserver("股票男", boss);
        // 看NBA的同事
        NBAObserver nbaObserver = new NBAObserver("看NBA男", boss);
        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.setSubjectState("老板说：我胡汉三回来了");
        boss.notifyChanged();

    }
}
