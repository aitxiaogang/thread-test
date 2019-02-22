package unit_2.StringAndSyn2;

/**
 * @author xiaogang
 * @date 2019/2/19 10:17
 */
public class Service {
    public static void print(Object object){
        try {
            synchronized (object){
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
