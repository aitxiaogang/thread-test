package unit_1.t12;

/**
 * @author xiaogang
 * @date 2019/2/12 10:03
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ = " + Thread.interrupted());
        System.out.println("是否停止2？ = " + Thread.interrupted());
    }
}
