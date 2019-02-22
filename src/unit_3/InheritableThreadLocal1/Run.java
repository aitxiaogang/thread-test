package unit_3.InheritableThreadLocal1;

/**
 * @author xiaogang
 * @date 2019/2/21 18:36
 */
public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在main线程中获取值："+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
