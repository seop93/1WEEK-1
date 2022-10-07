package Java_1007;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public List<PopulationMove> readFileByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        //삽을 이용 버퍼를 이용해 모래를 푼다
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;

    }

    public void readByLine2(String filename) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFileChar(String filename) throws IOException {
        //1byte 읽기
        FileReader fileReader = new FileReader("C:\\Users\\user\\Downloads\\population.csv");
        String fileContents = "";
        while (fileContents.length() < 100000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public PopulationMove parse(String data) throws IOException {

        //split 함수를 이용해 ',' 구분되어있는 거 자르기
        String[] populationMoveData = data.split(",");
        return new PopulationMove(populationMoveData[6], populationMoveData[0]);
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //List
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {

                writer.write(str);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }


    public static void main(String[] args) throws IOException {
        // 파일을 읽지 않는다.

       /* char c = (char)fileReader.read();
        System.out.println(c);*/


        //파일에다가 텍스트 파일 적어보기
/*        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readFileByLine("C:\\Users\\user\\Downloads\\population.csv");
        List<String> strings = new ArrayList<>();*/

/*        for (PopulationMove pm : pml) {
            String fromTo = ps.fromToString(pm);
            strings.add(fromTo);
        }
        ps.write(strings, "./from_to");*/

        String addr = "./from_to";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readFileByLine(addr);

        //데이터 확인
/*        for(PopulationMove pm : pml){
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(),pm.getToSido());
        }*/

        Map<String, Integer> moveCntMap = new HashMap<>();
        // A ~ Z
        
    }
}
