package Java_1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {
    public void readFileByLine(String filename) throws IOException {

        //삽을 이용 버퍼를 이용해 모래를 푼다
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();


    }

/*    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        ))
    }*/

    public void readFileChar(String filename) throws IOException{
        //1byte 읽기
        FileReader fileReader = new FileReader("C:\\Users\\user\\Downloads\\population.csv");
        String fileContents = "";
        while (fileContents.length() < 100000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public PopulationMove parse(String data) throws IOException{
        String[] populationMoveData = data.split(",");
        return new PopulationMove(Integer.valueOf(populationMoveData[0]), Integer.valueOf(populationMoveData[6]));
    }


    public static void main(String[] args) throws IOException {
        // 파일을 읽지 않는다.

       /* char c = (char)fileReader.read();
        System.out.println(c);*/

        PopulationStatistics ps = new PopulationStatistics();
        ps.readFileByLine("C:\\Users\\user\\Downloads\\population.csv");

    }
}
