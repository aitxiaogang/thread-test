package unit_3.p_r_test;

/**
 * @author xiaogang
 * @date 2019/2/20 16:50
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
