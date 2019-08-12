package com.yungu.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jony
 * @DATA 2019/8/12 14:53
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("是是是");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("写入文件");
        }
    }
}
