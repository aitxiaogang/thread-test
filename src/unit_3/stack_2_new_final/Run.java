package unit_3.stack_2_new_final;

/**
 * @author xiaogang
 * @date 2019/2/20 16:50
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        ThreadC threadC2 = new ThreadC(c2);
        ThreadC threadC3 = new ThreadC(c3);
        ThreadC threadC4 = new ThreadC(c4);
        ThreadC threadC5 = new ThreadC(c5);
        threadP.start();
        threadC.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();

    }
}
