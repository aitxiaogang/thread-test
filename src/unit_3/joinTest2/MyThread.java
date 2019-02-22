package unit_3.joinTest2;

/**
 * @author xiaogang
 * @date 2019/2/21 15:56
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        int secondValue = (int) (Math.random()*1000);
        System.out.println(secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
