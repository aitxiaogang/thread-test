package unit_3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author xiaogang
 * @date 2019/2/21 14:52
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream pipedInputStream;

    public ThreadRead(ReadData readData, PipedInputStream pipedInputStream) {
        this.readData = readData;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try {
            readData.readMethod(pipedInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
