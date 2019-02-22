package unit_4.ConditionTestManyToMany;


/**
 * @author xiaogang
 * @date 2019/2/22 10:02
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA[] at = new ThreadA[10];
        ThreadB[] bt = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            at[i] = new ThreadA(myService);
            at[i].setName("a"+i);
            at[i].start();
            bt[i] = new ThreadB(myService);
            bt[i].setName("b"+i);
            bt[i].start();
        }
    }
}

