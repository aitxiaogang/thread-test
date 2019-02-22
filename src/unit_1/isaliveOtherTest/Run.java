package unit_1.isaliveOtherTest;


/**
 * @author xiaogang
 * @date 2019/2/11 16:00
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        System.out.println("main begin t1 isAlive= "+ t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}
