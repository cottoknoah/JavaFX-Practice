package tutoring;


public class Decrypt {

    static char xorKey = 'X';

    public Decrypt(){}

    public static char[] blockDecrypt(char[] arr) {
        int size = arr.length;


        while(size % 5 != 0) {
            size++;
        }

        char[] newArr = new char[size];
        char[] tempArr = new char[5];
        int pos = 0;
        int loc = 0; // location of tempArr
        for(int i = 0; i < size; i++) {
            char val;

            if(i >= arr.length) {
                val = 'X';
            } else {
                val = arr[i];
            }
            switch (pos) {

                case 2:
                    tempArr[0] = (char)((int) val ^ xorKey);
                    break;
                case 4:
                    tempArr[1] = (char)((int) val ^ xorKey);
                    break;
                case 0:
                    tempArr[2] = (char)((int) val ^ xorKey);
                    break;
                case 1:
                    tempArr[3] = (char)((int) val ^ xorKey);
                    break;
                case 3:
                    tempArr[4] = (char)((int) val ^ xorKey);
                    break;
            }

            if(pos == 4) {
                pos = 0;

                for(int x = 0; x < 5; x++) {
                    newArr[loc+x] = tempArr[x];
                }

                loc += 5;
            } else {
                pos++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            int endLen = newArr.length - 5;

            if(i > endLen) {
                if(newArr[i] == 'X') {
                    newArr[i] = 0;
                }
            }
        }
        return newArr;
    }
}
