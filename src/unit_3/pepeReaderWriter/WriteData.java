package unit_3.pepeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * @author xiaogang
 * @date 2019/2/21 15:04
 */
public class WriteData {
    public void writeMethod(PipedWriter pipedWriter) throws IOException {
        System.out.println("write:");
        for (int i = 0; i < 300; i++) {
            String data = ""+(i+1);
            pipedWriter.write(data);
        }
        pipedWriter.close();
    }
}
