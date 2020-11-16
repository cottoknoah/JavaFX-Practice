package tutoring;


public class Decrypt {

    static char xorKey = 'X';

    public Decrypt(){}

    public static char[] blockDecrypt(char[] arr) {
        int size = arr.length;


        while (size % 5 != 0) {
            size++;
        }
    }

}
