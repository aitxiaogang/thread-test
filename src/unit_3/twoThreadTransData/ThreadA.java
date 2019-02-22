package unit_3.twoThreadTransData;

/**
 * @author xiaogang
 * @date 2019/2/19 17:23
 */
public class ThreadA extends Thread{

    private MyList myList;

    public ThreadA(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myList.add();
            System.out.println("添加了"+(i+1)+"个元素");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
