package unit_1.t13forprint;

/**
 * @author xiaogang
 * @date 2019/2/12 12:09
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (interrupted()) {
                System.out.println("线程已经标记为停止状态，即将退出");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"   i= "+i);
        }
        System.out.println("我是for语句下面的代码，我被执行了，线程并未停止");
    }
}
