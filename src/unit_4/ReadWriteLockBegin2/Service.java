package unit_4.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 13:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(){
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName()+" 获取写锁 获得时间："+System.currentTimeMillis());
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }
}
