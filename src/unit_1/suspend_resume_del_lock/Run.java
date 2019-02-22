package unit_1.suspend_resume_del_lock;

/**
 * @author xiaogang
 * @date 2019/2/12 15:37
 */
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();

            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };

            //设置线程的名称为a，开启线程，然后主线程休眠1秒
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);


            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2启动了，但是无法进入object的printString方法");
                    System.out.println("因为printString方法被a线程锁定并且永远suspend暂停了");
                    System.out.println("并且thread2的object对象被thread1独占了，thread1又永远暂停，thread2又在不断获取object对象的使用权，但是拿不到，所以thread2也跟随thread1处于永远粘暂停的状态，造成程序假死");
                    object.printString();
                }
            };
            thread2.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
