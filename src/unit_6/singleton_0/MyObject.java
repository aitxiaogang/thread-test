package unit_6.singleton_0;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyObject {
    private static MyObject myObject = new MyObject();
    public static MyObject getInstance(){
        return myObject;
    }
}
