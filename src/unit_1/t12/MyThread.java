package unit_1.t12;

/**
 * @author xiaogang
 * @date 2019/2/12 9:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i= "+(i+1));
        }
    }
}
