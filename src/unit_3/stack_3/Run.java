package unit_3.stack_3;

/**
 * @author xiaogang
 * @date 2019/2/21 11:28
 */
public class Run {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        P ps = new P(stack);
        P ps2 = new P(stack);
        P ps3 = new P(stack);
        P ps4 = new P(stack);
        P ps5 = new P(stack);
        C c = new C(stack);

        ThreadA p1 = new ThreadA(ps);
        p1.setName("生产者1");
        ThreadA p2 = new ThreadA(ps2);
        p2.setName("生产者2");
        ThreadA p3 = new ThreadA(ps3);
        p3.setName("生产者3");
        ThreadA p4 = new ThreadA(ps4);
        p4.setName("生产者4");
        ThreadA p5 = new ThreadA(ps5);
        p5.setName("生产者5");

        ThreadB c1 = new ThreadB(c);
        c1.setName("消费者1");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        c1.start();

    }
}
