package unit_6.singleton_2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:47
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyObject {
    private static MyObject myObject;
    public static MyObject getInstance(){
        if (myObject != null) {
            return myObject;
        }else{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myObject = new MyObject();
        }
        return myObject;
    }
}
