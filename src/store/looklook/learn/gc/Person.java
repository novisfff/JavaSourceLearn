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
    int index;

    static int currentNum = 0;

    public Person(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
        currentNum++;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了" + index);
        currentNum--;
        super.finalize();
    }
}
