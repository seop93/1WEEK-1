package Java_1006.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        //디렉토리 알아보기
        File dir = new File("./");
        File files[] = dir.listFiles();

        for(File file: files){
            System.out.println(file);
        }
    }
}
