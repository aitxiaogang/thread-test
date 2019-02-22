package unit_3.ThreadLocal33;

import java.util.Date;

/**
 * @author xiaogang
 * @date 2019/2/21 18:09
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
