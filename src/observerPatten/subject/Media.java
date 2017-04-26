package observerPatten.subject;

/**
 * Created by XIN.LIU on 2017/4/26.
 */
public class Media extends SubjectImpl{

    /**
     *field 域  name
     */
    private String name;

    /**
     * Constructor 无参构造器
     * @param
     */
    public Media() {

    }

    /**
     * Constructor 有参构造器
     * @param name
     */
    public Media(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Media{" +"欢迎关注"+
                "name='" + name + '\'' +"新闻"+
                '}';
    }
}
