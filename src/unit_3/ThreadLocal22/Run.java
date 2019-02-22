package unit_3.ThreadLocal22;

/**
 * @author xiaogang
 * @date 2019/2/21 18:10
 */
public class Run {
    private static ThreadLocalExt threadLocalExt = new ThreadLocalExt();
    public static void main(String[] args) {
        if (threadLocalExt.get() == null) {
            System.out.println("从未放过值");
            threadLocalExt.set("我的值");
        }
        System.out.println(threadLocalExt.get());
        System.out.println(threadLocalExt.get());
    }
}
