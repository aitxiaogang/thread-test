package unit_3.wait_notify_insert_test;

/**
 * @author xiaogang
 * @date 2019/2/21 15:33
 */
public class BackupA extends Thread {

    DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
