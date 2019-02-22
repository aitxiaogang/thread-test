package unit_1.t4_threadsafe;

/**
 * @author xiaogang
 * @date 2019/2/11 15:29
 */
public class Run {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
