package testReadFromFile.adapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamAdapter implements IReadAdapter{
    private FileInputStream fileInputStream;

    public FileInputStreamAdapter()  {
        try {
            this.fileInputStream = new FileInputStream("ReadMe");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readTest() {
        try {
            byte [] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() {
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
