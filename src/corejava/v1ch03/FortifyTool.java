/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FortifyTool {
    public FortifyTool() {
    }

    public static File newFile(String fileName) {
        return new File(fileName);
    }

    public static FileOutputStream newFileOutputStream(String fileName) throws FileNotFoundException {
        return newFileOutputStream(fileName, false);
    }

    public static FileOutputStream newFileOutputStream(String fileName, boolean append) throws FileNotFoundException {
        return new FileOutputStream(fileName, append);
    }

    public static FileInputStream newFileInputStream(String fileName) throws FileNotFoundException {
        return new FileInputStream(fileName);
    }
}
