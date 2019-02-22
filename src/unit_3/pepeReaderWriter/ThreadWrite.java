package unit_3.pepeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author xiaogang
 * @date 2019/2/21 14:50
 */
public class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedWriter pipedWriter;

    public ThreadWrite(WriteData writeData, PipedWriter pipedWriter) {
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        try {
            writeData.writeMethod(pipedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
