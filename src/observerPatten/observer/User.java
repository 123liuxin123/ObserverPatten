package observerPatten.observer;

/**
 * Created by XIN.LIU on 2017/4/26.
 */
public class User extends ObserverImpl{

    /**
     *field 域  name
     */
    public String name;

    public String getName() {
        return name;
    }

    /**
     * Constructor 无参构造器
     * @param
     */
    public User() {

    }

    /**
     * Constructor 有参构造器
     * @param name
     */
    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String mediaName) {
        System.out.println("欢迎"+this.getName()+"订阅"+mediaName);
    }
}
