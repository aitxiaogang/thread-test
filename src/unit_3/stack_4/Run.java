package unit_3.stack_4;

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
        C c2 = new C(stack);
        C c3 = new C(stack);
        C c4 = new C(stack);
        C c5 = new C(stack);

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

        ThreadB ct1 = new ThreadB(c);
        ct1.setName("消费者1");
        ThreadB ct2 = new ThreadB(c2);
        ct2.setName("消费者2");
        ThreadB ct3 = new ThreadB(c3);
        ct3.setName("消费者3");
        ThreadB ct4 = new ThreadB(c4);
        ct4.setName("消费者4");
        ThreadB ct5 = new ThreadB(c5);
        ct5.setName("消费者5");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();

    }
}
