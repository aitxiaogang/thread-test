package unit_3.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author xiaogang
 * @date 2019/2/21 14:15
 */
public class WriteData {

    public void writeMethod(PipedOutputStream outputStream) throws IOException {
        System.out.print("write:");
        for (int i = 0; i < 300; i++) {
            String outData = ""+(i+1);
            outputStream.write(outData.getBytes());
//            System.out.println(outData);
        }
        System.out.println();
        outputStream.close();
    }
}
