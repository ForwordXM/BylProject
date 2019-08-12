package com.yungu.demo;

import java.io.*;

/**
 * @author Jony
 * @DATA 2019/8/12 14:08
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //写入.txt文件
        File file = new File("result.txt");
        //创建新文件
        file.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("写入的文件");
        bufferedWriter.flush();
        bufferedWriter.close();
        //读取.txt文件
        String pathname = "E:\\result.txt";
        File file1 = new File(pathname);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file1));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String string = "";
        string = bufferedReader.readLine();
        while (string != null) {
            string = bufferedReader.readLine();
        }
    }
}
