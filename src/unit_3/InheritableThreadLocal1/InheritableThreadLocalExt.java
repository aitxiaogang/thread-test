package unit_3.InheritableThreadLocal1;

import java.util.Date;

/**
 * @author xiaogang
 * @date 2019/2/21 18:21
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
