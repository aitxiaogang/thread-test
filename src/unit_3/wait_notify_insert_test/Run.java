package unit_3.wait_notify_insert_test;

/**
 * @author xiaogang
 * @date 2019/2/21 15:34
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 10; i++) {
            BackupA backupA = new BackupA(dbTools);
            backupA.setName("thread a");
            BackupB backupB = new BackupB(dbTools);
            backupB.setName("thread b");

            backupA.start();
            backupB.start();
        }

    }
}
