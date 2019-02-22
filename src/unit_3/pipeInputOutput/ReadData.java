package unit_3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author xiaogang
 * @date 2019/2/21 14:44
 */
public class ReadData {

    public void readMethod(PipedInputStream inputStream) throws IOException {
        byte[] b = new byte[20];
        int readLength = inputStream.read(b);
        System.out.print("read data:");
        while (readLength != -1) {
            String data = new String(b,0,readLength);
            System.out.print(data);
            readLength = inputStream.read(b);
        }
        System.out.println();
        inputStream.close();
    }
}
