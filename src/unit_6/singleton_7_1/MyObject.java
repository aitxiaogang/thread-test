package unit_6.singleton_7_1;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 15:05
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyObject implements Serializable{
    private static final long serialVersionUID = -7031920939069294661L;

    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve(){
        System.out.println("MyObject.readResolve");
        return MyObjectHandler.myObject;
    }

}
