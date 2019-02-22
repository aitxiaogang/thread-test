package unit_3.pepeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @author xiaogang
 * @date 2019/2/21 15:07
 */
public class ReadData {
    public void readData(PipedReader pipedReader) throws IOException {
        System.out.println("read:");
        char[] chars = new char[20];
        int readLength = pipedReader.read(chars);
        while (readLength != -1) {
            String data = new String(chars);
            System.out.print(data);
            readLength = pipedReader.read(chars);
        }
        pipedReader.close();
    }
}
