package observerPatten.subject;

import observerPatten.observer.Observer;

/**
 * Created by XIN.LIU on 2017/4/26.
 */

/**
 * 主题（发布者，被观察者）
 */
public interface Subject {

    /**
     * 关联（注册）观察者
     */
    void attach(Observer o);

    /**
     * 解除关联
     */
    void detach(Observer o);

    /**
     * 通知观察者
     */
    void notifyAllObservers(Object value);
}
