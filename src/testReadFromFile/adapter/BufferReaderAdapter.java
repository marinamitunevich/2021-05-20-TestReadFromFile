package testReadFromFile.adapter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderAdapter implements IReadAdapter {
    private BufferedReader bufferedReader;

    public BufferReaderAdapter() {
        try {
            this.bufferedReader = new BufferedReader(new FileReader("ReadMe"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readTest() {
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
