import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File {
    public void write()
            throws IOException {
        String str = "saba momtselidze";
        FileOutputStream outputStream = new FileOutputStream("text.txt");
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);
        outputStream.close();
    }
}