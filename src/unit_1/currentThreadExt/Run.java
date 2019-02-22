package unit_1.currentThreadExt;

/**
 * @author xiaogang
 * @date 2019/2/11 16:00
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        t1.setName("A");
        t1.start();
    }
}
