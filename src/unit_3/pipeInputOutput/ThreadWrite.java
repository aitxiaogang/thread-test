package unit_3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author xiaogang
 * @date 2019/2/21 14:50
 */
public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedOutputStream pipedOutputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream pipedOutputStream) {
        this.writeData = writeData;
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
            writeData.writeMethod(pipedOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
