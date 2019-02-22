package unit_3.ThreadLocal33;

/**
 * @author xiaogang
 * @date 2019/2/21 18:14
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
