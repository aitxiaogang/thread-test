package unit_3.stack_4;

/**
 * @author xiaogang
 * @date 2019/2/21 11:14
 */
public class P {

    private MyStack stack;

    public P(MyStack stack) {
        this.stack = stack;
    }

    public void pushService(){
        try {
            stack.push();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
