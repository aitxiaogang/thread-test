package unit_3.p_r_test;

/**
 * @author xiaogang
 * @date 2019/2/20 16:48
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            //使用同一个对象锁
            synchronized (lock) {
                //获取值，如果值是空白，释放锁，进入等待队列中
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                //有值，将获取的值打印出来，并重置获取到的值，唤醒一个lock的等待线程
                System.out.println("get 的值是 "+ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
