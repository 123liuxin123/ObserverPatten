package observerPatten.subject;

import observerPatten.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XIN.LIU on 2017/4/26.
 */
public abstract  class SubjectImpl implements Subject{

    /**
     * 该发布者中所有的观察者
     */
    public List<Observer> observers = new ArrayList<Observer>();

    /**
     * 在发布者中绑定新的观察者
     * @param o
     */
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    /**
     * 从发布者中移除某一已绑定观察者
     * @param o
     */
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    /**
     * 当发布者状态改变时通知所有观察者
     */
    @Override
    public void notifyAllObservers(Object value) {
        for (Observer o : observers){
            o.update((String) value);
        }
    }
}
