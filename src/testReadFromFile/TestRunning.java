package testReadFromFile;

import testReadFromFile.adapter.BufferReaderAdapter;
import testReadFromFile.adapter.FileInputStreamAdapter;
import testReadFromFile.adapter.IReadAdapter;

public class TestRunning {
    public static void main(String[] args) {
        IReadAdapter bufferReader = new BufferReaderAdapter();
        IReadAdapter fileInputStream = new FileInputStreamAdapter();

        Test test = new Test(bufferReader);
        System.out.println("Read file with BufferReader: "+test.test(500_000));

        test = new Test(fileInputStream);
        System.out.println("Read file with FileInputReader: "+test.test(500_000));
    }


}
