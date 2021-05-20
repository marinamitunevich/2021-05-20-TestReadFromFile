package testReadFromFile;

import testReadFromFile.adapter.IReadAdapter;

public class Test {
    private IReadAdapter adapter;

    public Test(IReadAdapter adapter) {
        this.adapter = adapter;
    }

    public long test(int length){
        long start = System.currentTimeMillis();
        for (int i = 0; i <= length; i++) {
            adapter.readTest();
        }
        adapter.close();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
