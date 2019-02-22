package unit_2.syncNotExtends;

/**
 * @author xiaogang
 * @date 2019/2/18 11:23
 */
public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThreadA threadA = new MyThreadA(sub);
        threadA.setName("A");
        threadA.start();
        MyThreadB threadB = new MyThreadB(sub);
        threadB.setName("B");
        threadB.start();
    }
}
