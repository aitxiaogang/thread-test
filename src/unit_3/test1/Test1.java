package unit_3.test1;

/**
 * @author xiaogang
 * @date 2019/2/19 18:11
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
