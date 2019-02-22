package unit_2.t9;

/**
 * @author xiaogang
 * @date 2019/2/18 16:39
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
//            if (list.getSize() < 1) {
//                Thread.sleep(2000);
//                list.add(data);
//            }
            synchronized (list){
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
