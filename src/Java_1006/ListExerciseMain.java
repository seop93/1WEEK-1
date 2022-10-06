package Java_1006;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise le = new ListExercise();

        for( String student : le.getStudents() ){
            System.out.println(student);
        }

        System.out.println(le.getStudents().size());
    }
}
