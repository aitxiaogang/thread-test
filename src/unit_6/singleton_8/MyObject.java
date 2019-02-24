package unit_6.singleton_8;

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
        return myObject;
    }
    static {
        myObject = new MyObject();
    }
}
