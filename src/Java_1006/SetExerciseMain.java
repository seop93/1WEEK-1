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
        for(int i = 0; i <50; i++){
            int r = ng.generate(10);
            System.out.println(r);
        }

    }
}
