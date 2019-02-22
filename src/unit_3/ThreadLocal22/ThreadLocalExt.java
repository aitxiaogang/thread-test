package unit_3.ThreadLocal22;

/**
 * @author xiaogang
 * @date 2019/2/21 18:09
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再为null";
    }
}
