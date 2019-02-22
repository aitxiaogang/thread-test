package unit_2.t3;

/**
 * @author xiaogang
 * @date 2019/2/14 18:30
 */
public class Run {
    public static void main(String[] args) {
        try {
         PublicVar publicVar = new PublicVar();
         ThreadA threadA = new ThreadA(publicVar);
         threadA.start();
         Thread.sleep(200);
         //因为setValue是同步的方法，线程拥有PublicVar的对象在执行
         publicVar.getValue();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
