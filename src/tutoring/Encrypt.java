package tutoring;

public class Encrypt {

    static char xorKey = 'X';
    public Encrypt(){}

    public static char[] blockEncrypt(char[] arr) {
        int size = arr.length;

        // round up size for blocks of 5
        while(size % 5 != 0) {
            size++;
        }

        char[] newArr = new char[size];
        char[] tempArr = new char[5];
        int pos = 0;
        int loc = 0; // location of tempArr
        for(int i = 0; i < size; i++) {
            char val;


}