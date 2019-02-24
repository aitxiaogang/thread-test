package unit_6.singleton_7;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 15:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
