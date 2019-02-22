package unit_3.pipeInputOutput;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author xiaogang
 * @date 2019/2/21 14:47
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();

            pipedOutputStream.connect(pipedInputStream);

            ThreadWrite threadWrite = new ThreadWrite(writeData,pipedOutputStream);
            threadWrite.setName("threadWrite");

            ThreadRead threadRead = new ThreadRead(readData,pipedInputStream);
            threadRead.setName("threadRead");


            threadRead.start();
            Thread.sleep(2000);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
