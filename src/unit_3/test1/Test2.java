package unit_3.test1;

/**
 * @author xiaogang
 * @date 2019/2/19 18:13
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("syn下面");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
