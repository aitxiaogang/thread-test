package unit_3.s5;

import java.util.Date;

/**
 * @author xiaogang
 * @date 2019/2/21 17:51
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("ThreadB get Value="+ Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
