package unit_4.condition123;

import unit_2.t1.ThreadA;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 11:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Run {
    private static Lock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();
    private static Condition conditionC = lock.newCondition();
    private static int nextPrint = 1;


    public static void main(String[] args) throws Exception {
        Thread threadA = new Thread(() -> {
            try {
                lock.lock();
                if (nextPrint != 1) {
                    conditionA.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadA print:"+(i+1));
                }
                nextPrint = 2;
                conditionB.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        Thread threadB = new Thread(()->{
            try {
                lock.lock();
                if (nextPrint != 2) {
                    conditionB.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadB print:"+(i+1));
                }
                nextPrint = 3;
                conditionC.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        Thread threadC = new Thread(()->{
            try {
                lock.lock();
                if (nextPrint != 3) {
                    conditionC.await();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("ThreadC print:"+(i+1));
                }
                nextPrint = 1;
                conditionA.signalAll();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        Thread[] ta = new Thread[5];
        Thread[] tb = new Thread[5];
        Thread[] tc = new Thread[5];
        for (int i = 0; i < 5; i++) {
            ta[i] = new Thread(threadA);
            tb[i] = new Thread(threadB);
            tc[i] = new Thread(threadC);
            ta[i].start();
            tb[i].start();
            tc[i].start();
        }

    }
}
