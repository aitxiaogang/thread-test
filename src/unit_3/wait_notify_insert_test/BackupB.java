package unit_3.wait_notify_insert_test;

/**
 * @author xiaogang
 * @date 2019/2/21 15:33
 */
public class BackupB extends Thread {

    DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
