package unit_4.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 17:28
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void waitMethod(){
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName()+" 获得锁");
        }else{
            System.out.println(Thread.currentThread().getName()+"  没有获得锁");
        }
    }
}
