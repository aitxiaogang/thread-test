package unit_2.StringAndSyn;

/**
 * @author xiaogang
 * @date 2019/2/19 10:17
 */
public class Service {
    public static void print(String stringParam){
        try {
            synchronized (stringParam){
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
