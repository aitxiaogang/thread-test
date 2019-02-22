package unit_3.InheritableThreadLocal1;

/**
 * @author xiaogang
 * @date 2019/2/21 18:31
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中获取的值："+Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
