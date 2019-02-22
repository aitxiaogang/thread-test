package unit_3.s5;

import java.util.Date;

/**
 * @author xiaogang
 * @date 2019/2/21 17:51
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("ThreadA get Value="+ Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
