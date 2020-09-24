package store.looklook.learn.gc;

/**
 * @author ：zyf
 * @date ：Created in 2020/9/24
 * @description：
 * @modified By：
 * @version: $
 */

public class Person {
    int age;
    String name;

    static int currentNum = 0;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        currentNum++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了");
        currentNum--;
        super.finalize();
    }
}
