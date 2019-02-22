package unit_1.t13;

/**
 * @author xiaogang
 * @date 2019/2/12 11:42
 */
public class MyThread extends Thread {

    private int count = 5000;
    private int i = 0;

    @Override
    public void run() {
        super.run();
        while (i < count){
            if (interrupted()) {
                System.out.println("已经是停止状态了，即将退出!");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"  i = "+(i++));
        }
    }
}
