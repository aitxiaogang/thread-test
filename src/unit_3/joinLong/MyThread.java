package unit_3.joinLong;

import unit_3.joinException.ThreadC;

/**
 * @author xiaogang
 * @date 2019/2/21 16:18
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
