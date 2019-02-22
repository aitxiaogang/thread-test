package unit_3.pepeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author xiaogang
 * @date 2019/2/21 14:52
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        this.readData = readData;
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        try {
            readData.readData(pipedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
