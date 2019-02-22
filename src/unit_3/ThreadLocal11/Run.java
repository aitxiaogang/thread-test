package unit_3.ThreadLocal11;

/**
 * @author xiaogang
 * @date 2019/2/21 17:49
 */
public class Run {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
