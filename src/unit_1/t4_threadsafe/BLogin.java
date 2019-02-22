package unit_1.t4_threadsafe;

/**
 * @author xiaogang
 * @date 2019/2/11 15:29
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
