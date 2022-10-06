package Java_1006.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        //디렉토리 알아보기
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
        FileExercise fileExercise = new FileExercise();
        String str = fileExercise.read2Chars("b_file");
        //FileReader fileReader = new FileReader("./b_file");
        //char c = fileExercise.readAChar("./b_file");
        //System.out.println(c);
        System.out.println(str);
    }
}
