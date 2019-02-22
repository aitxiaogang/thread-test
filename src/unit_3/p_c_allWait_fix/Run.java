package unit_3.p_c_allWait_fix;

/**
 * @author xiaogang
 * @date 2019/2/20 16:50
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者："+(i+1));
            threadC[i] = new ThreadC(c);
            threadC[i].setName("消费者："+(i+1));
            threadP[i].start();
            threadC[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
        }
    }
}
