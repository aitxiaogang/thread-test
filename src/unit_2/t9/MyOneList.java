package unit_2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaogang
 * @date 2019/2/18 16:37
 */
public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }
}
