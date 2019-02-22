package unit_4.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaogang
 * @date 2019/2/22 15:22
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();


    public void serviceMethod1(){
        try {
            lock.lock();
            System.out.println("Service.serviceMethod1  getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("Service.serviceMethod2 getHoldCount="+lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
