package store.looklook.learn.gc;

/**
 * @author ：zyf
 * @date ：Created in 2020/9/24
 * @description：
 * @modified By：
 * @version: $
 */

public class test {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Person(1, "无名氏");
        }
        System.out.println(Person.currentNum);
    }

}
