package Java_1006.alphabet;

public class AlphabetCnt {
    public static void main(String[] args) {
        String s1 = "adasfldpsgwewesd";

        for (int i = 0; i < s1.length(); i++) {

        }
    }

    public static boolean isAlphabet(char c){
        if((65 <= c && c <= 90) || ( 97 <= c && c <= 122) ){
            return true;
        } else{
            return false;
        }


    }
}
