package org.example.main;

import java.io.*;

public class ImputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try{
            File file=new File("text1.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            InputStream in=new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("text1.txt")));
        while ((c= in.read())>=0){
            System.out.print((char) c);
        }
        in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
