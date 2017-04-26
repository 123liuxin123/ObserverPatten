package observerPatten.demo;

import observerPatten.observer.User;
import observerPatten.subject.Media;

/**
 * Created by XIN.LIU on 2017/4/26.
 */

public class demo {

    /**
     * 霍建华，胡歌和鹿晗都订阅了网易新闻，突然有一天，网易新闻更名为优先新闻，此时需要通知胡霍鹿
     * @param args
     */
    public static void main(String[] args){

        /**
         * 1.创建网易新闻
         */
        Media netEase = new Media("netEase");

        /**
         * 2.创建霍建华，胡歌，鹿晗
         */
        User huo = new User("WallaceHuo");
        User hu = new User("HuG");
        User lu = new User("lueHan");

        /**
         * 3.胡霍鹿都订阅了网易
         */
        netEase.attach(huo);
        netEase.attach(hu);
        netEase.attach(lu);

        /**
         * 4.网易新闻更名为优先新闻
         */
        netEase.notifyAllObservers("netEase");
    }
}
