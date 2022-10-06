package Java_1006;

import java.util.HashSet;
import java.util.Set;

public class SetExerciseMain {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set
        set1.add("변흥섭");
        set1.add("변흥섭"); //중복불가
        set1.add("김미미");
        System.out.println(set1);

        //랜덤한 숫자 (중복없이)50개 만들어보기
        NumberGenerator ng = new RandomNumberGenerator();
        AlphabetGenerator ag = new RandomAlphabetGenerator();
        Set<Integer> inte = new HashSet<>();
        Set<Character> inch = new HashSet<>();
        for(int i = 0; i <100; i++){
            int r = ng.generate(50);
            char ran = ag.generate();
            inte.add(r); //중복제거
            inch.add(ran);
/*            System.out.print(r + " ");
            System.out.println();*/
            System.out.print(ran + " ");
        }







    }
}
