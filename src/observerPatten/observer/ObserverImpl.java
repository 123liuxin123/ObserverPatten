package observerPatten.observer;

import observerPatten.subject.SubjectImpl;

/**
 * Created by XIN.LIU on 2017/4/26.
 */
public abstract class ObserverImpl implements Observer{

    @Override
    public abstract void update(String  mediaName);
}
