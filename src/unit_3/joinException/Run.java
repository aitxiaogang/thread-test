package unit_3.joinException;

/**
 * @author xiaogang
 * @date 2019/2/21 16:07
 */
public class Run {
    public static void main(String[] args) {
        try {
         ThreadB threadB = new ThreadB();
         threadB.start();
         Thread.sleep(500);
         ThreadC threadC = new ThreadC(threadB);
         threadC.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
