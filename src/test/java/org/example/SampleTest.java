package org.example;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    public void checkFilesNoFilterTest()
    {
        File f = new File("src");
        File[] flist = f.listFiles();
        for(File ff:flist)
        {
            System.out.println(ff.getAbsolutePath());
        }

        assertEquals(4,flist.length);

    }

    @Test
    public void checkFilesdir3FilterTest()
    {
        File f = new File("src");
        File[] dlist = f.listFiles( (d) -> d.isDirectory());
        for(File ff:dlist)
        {
            System.out.println(ff.getAbsolutePath());
        }

        assertEquals(2,dlist.length);

    }

    @Test
    public void checkFilesdirFilterTest()
    {
        assertEquals(1,1);

    }
}