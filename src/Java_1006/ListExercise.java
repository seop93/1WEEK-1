package Java_1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("김길동");
        this.students.add("이길동");
        this.students.add("변길동");
        this.students.add("황길동");
        this.students.add("왕길동");
    }

    public List<String> getStudents(){
        return this.students;
    }


}
