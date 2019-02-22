package unit_3.ThreadLocalTest;

/**
 * @author xiaogang
 * @date 2019/2/21 17:51
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadA"+(i+1));
                System.out.println("ThreadA get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
