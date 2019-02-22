package unit_2.synBlockMoreObjectOneLock;

/**
 * @author xiaogang
 * @date 2019/2/19 10:10
 */
public class Service {

    synchronized public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("进入 Service.printA  thread name = "+Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("离开 Service.printA  thread name = "+Thread.currentThread().getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    synchronized public static void printB(){
        synchronized (Service.class){
            try {
                System.out.println("进入 Service.printB  thread name = "+Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("离开 Service.printB  thread name = "+Thread.currentThread().getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
