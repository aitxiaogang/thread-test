package unit_2.setNewStringTwoLock;


import unit_2.doubleSynBlockOneTwo.ObjectService;

/**
 * @author xiaogang
 * @date 2019/2/18 12:27
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService objectService = new MyService();
        Thread1 t = new Thread1(objectService);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(objectService);
        t2.setName("B");
        //如果不sleep，那么两个线程的锁对象都是“123”，所以是同步的。如果停了，第一个线程先启动，进入代码之后
        //将lock的值改为“456”，出现两个锁，第二个线程用的和第一个线程不一样的锁对象“456”，所以不需要等第一个
        //锁释放就能直接执行
        Thread.sleep(1000);
        t2.start();
    }
}
