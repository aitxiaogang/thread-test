package unit_6.singleton_1;

import unit_6.singleton_0.MyObject;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
