package unit_6.singleton_7_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 15:09
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SaveAndRead {
    public static void main(String[] args) throws Exception {
        try {
            MyObject instance = MyObject.getInstance();
            System.out.println(instance.hashCode());
            saveObject(instance);
            readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveObject(Object o) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E://o");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(o);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readObject() {
        try {
            FileInputStream fileInputStream = new FileInputStream("E://o");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            System.out.println(o.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
