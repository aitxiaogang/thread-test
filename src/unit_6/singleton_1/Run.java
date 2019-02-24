package unit_6.singleton_1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
