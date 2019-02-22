package unit_1.t13_stop_thread;

/**
 * @author xiaogang
 * @date 2019/2/12 12:09
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                if (interrupted()) {
                    System.out.println("线程已经标记为停止状态，即将退出");
                    throw new InterruptedException();
                }
                System.out.println(Thread.currentThread().getName() + "   i= " + i);
            }
            System.out.println("我是for语句下面的代码，我被执行了，线程并未停止");
        } catch (Exception e) {
            System.out.println("捕捉到终止线程异常，终止当前线程继续执行");
            e.printStackTrace();
        }
    }
}
