package testReadFromFile;

import testReadFromFile.adapter.BufferReaderAdapter;
import testReadFromFile.adapter.FileInputStreamAdapter;
import testReadFromFile.adapter.IReadAdapter;

public class TestRunning {
    public static void main(String[] args) {
        String filePath = "ReadMe";
        IReadAdapter bufferReader = new BufferReaderAdapter(filePath);
        IReadAdapter fileInputStream = new FileInputStreamAdapter(filePath);

        Test test = new Test(bufferReader);
        System.out.println("Read file with BufferReader: "+test.test(500_000));

        test = new Test(fileInputStream);
        System.out.println("Read file with FileInputReader: "+test.test(500_000));
    }


}
