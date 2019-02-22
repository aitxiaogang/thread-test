package unit_3.p_r_test;

import sun.awt.SunHints;

/**
 * @author xiaogang
 * @date 2019/2/20 16:45
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            //使用同一个对象锁
            synchronized (lock) {
                //如果获取到的值不为空，说明生产的值还没有被使用，当前线程进入等待状态，释放锁
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                //获取到的值为空，创建一个不为空的值，赋值给ValueObject，并唤醒“lock”对象的所有等待线程
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set 的值是 "+value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
