package unit_3.twoThreadTransData;

/**
 * @author xiaogang
 * @date 2019/2/19 17:28
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA t1 = new ThreadA(myList);
        ThreadB t2 = new ThreadB(myList);
        t1.start();
        t2.start();
    }
}
