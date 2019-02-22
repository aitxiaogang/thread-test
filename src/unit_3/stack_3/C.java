package unit_3.stack_3;

/**
 * @author xiaogang
 * @date 2019/2/21 11:15
 */
public class C {
    private MyStack stack;

    public C(MyStack stack) {
        this.stack = stack;
    }

    public Object popService(){
        Object pop = null;
        try {
            pop = stack.pop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pop;
    }

}
