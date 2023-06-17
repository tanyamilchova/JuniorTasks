import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileSizeInDir {
    public static void main(String[] args) {
        //Напишете програма на Java, която извежда размера на всички файлове в дадена директория, подредени в нарастващ ред.
        ArrayList<Long>list=new ArrayList<>();
        File dir=new File("myFile");
        File[]arr=dir.listFiles();
        for (File f:arr){
            long size=f.length();
            list.add(size);
        }
        list.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(list);
    }
}
