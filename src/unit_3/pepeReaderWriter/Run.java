package unit_3.pepeReaderWriter;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @author xiaogang
 * @date 2019/2/21 14:47
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedReader pipedReader = new PipedReader();
            PipedWriter pipedWriter = new PipedWriter();

            pipedWriter.connect(pipedReader);

            ThreadWrite threadWrite = new ThreadWrite(writeData,pipedWriter);
            threadWrite.setName("threadWrite");

            ThreadRead threadRead = new ThreadRead(readData,pipedReader);
            threadRead.setName("threadRead");


            threadRead.start();
            Thread.sleep(2000);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
