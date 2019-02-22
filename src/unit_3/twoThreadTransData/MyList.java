package unit_3.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaogang
 * @date 2019/2/19 17:15
 */
public class MyList {
    private static List list = new ArrayList<>();
    public static void add(){
        list.add("ABC");
    }
    public static int size1(){
        return list.size();
    }
}
