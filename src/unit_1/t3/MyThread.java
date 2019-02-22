package unit_1.t3;

/**
 * @author xiaogang
 * @date 2019/2/11 9:44
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("由"+this.currentThread().getName()+"计算出的count="+this.count);
        }
    }
}
