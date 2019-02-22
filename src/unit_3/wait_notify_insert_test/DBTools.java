package unit_3.wait_notify_insert_test;

/**
 * @author xiaogang
 * @date 2019/2/21 15:26
 */
public class DBTools {

    private boolean isATurn = true;

    synchronized public void backupA() {
        try {
            while (!isATurn) {
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("AAAAAAAA");
            }
            isATurn = false;
            this.notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (isATurn) {
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("BBBBBB");
            }
            isATurn = true;
            this.notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
