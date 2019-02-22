package unit_2.synchronizedUpdateNewValue;

import unit_2.t9.MyOneList;

/**
 * @author xiaogang
 * @date 2019/2/18 16:42
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Thread1 t = new Thread1(service);
        t.setName("A");
        t.start();
        Thread.sleep(3000);
        Thread2 t2 = new Thread2(service);
        t2.setName("B");
        t2.start();
        System.out.println("已经发起停止的命令了");
    }
}
