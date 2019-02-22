package unit_3.stack_2_new_final;

/**
 * @author xiaogang
 * @date 2019/2/20 16:48
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){
        myStack.pop();
    }

}
