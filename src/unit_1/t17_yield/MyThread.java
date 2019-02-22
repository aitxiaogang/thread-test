package unit_1.t17_yield;

/**
 * @author xiaogang
 * @date 2019/2/12 16:47
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 500000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： "+(endTime - beginTime) + "毫秒");
    }
}
