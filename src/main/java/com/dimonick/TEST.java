package com.dimonick;

import java.io.File;
import java.io.IOException;

public class TEST {
    public static void main(String[] args) throws IOException {
        File file = new File("images"+File.separator+"polya"+File.separator+"OLO-LO");
        file.getParentFile().mkdirs();
        file.createNewFile();

        File file2 = new File("images"+File.separator+"lena"+File.separator+"OLO-LO2222");
        file2.getParentFile().mkdirs();
        file2.createNewFile();


    }
}
