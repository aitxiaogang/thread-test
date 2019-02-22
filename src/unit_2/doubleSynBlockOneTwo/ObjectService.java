package unit_2.doubleSynBlockOneTwo;

/**
 * @author xiaogang
 * @date 2019/2/18 15:11
 */
public class ObjectService {
    public void serviceMethodA(){
        try {
         synchronized (this){
             System.out.println("ObjectService.serviceMethodA  ");
             Thread.sleep(2000);
             System.out.println("ObjectService.serviceMethodA  end");
         }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        try {
            synchronized (this){
                System.out.println("ObjectService.serviceMethodB");
                Thread.sleep(2000);
                System.out.println("ObjectService.serviceMethodB end");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
