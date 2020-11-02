package tutoring;

public class Main {

    // my message1 HELLO = KHOOR
    private static char[] message = {'H', 'E', 'L', 'L', 'O'};

    // my message2 XYZA = ABCD
    private static char[] message2 = {'X', 'Y', 'Z', 'A'};

    public static void main(String[] args) {
        // Testing CeasarEncrypt
        char [] message1Encrypt = CaesarEncrypt(message);
        char [] message2Encrypt = CaesarEncrypt(message2);
        System.out.println("CaesarEncrypt: ");
        System.out.println(message1Encrypt);
        System.out.println(message2Encrypt);
        System.out.println("==========");
        System.out.println("CaesarDecrypt: ");
        System.out.println(CaesarDecrypt(message1Encrypt));
        System.out.println(CaesarDecrypt(message2Encrypt));

    }

    public static char[] CaesarEncrypt(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ascii = (int) arr[i] - 65;
            // X to A
            if (ascii == 23) {
                ascii = 0;
            }
            // Y to B
            else if(ascii == 24) {
                ascii = 1;
            }
            // Z to C
            else if(ascii == 25) {
                ascii = 2;
            }
            // All other letters that do not rotate
            else {
                ascii = ascii + 3;
            }
            ascii += 65;
            arr[i] = (char) ascii;
        }
        return arr;
    }

    public static char[] CaesarDecrypt(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ascii = (int) arr[i] - 65;
            // A to X
            if (ascii == 0) {
                ascii = 23;
            }
            // B to Y
            else if(ascii == 1) {
                ascii = 24;
            }
            // C to Z
            else if(ascii == 2) {
                ascii = 25;
            }
            // All other letters that do not rotate
            else {
                ascii = ascii - 3;
            }
            ascii += 65;
            arr[i] = (char) ascii;
        }
        return arr;
    }

    public static char[] affineEncrypt(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ascii = (int) arr[i] - 65;
            ascii = (3*ascii) + 5;
            ascii %= 26;
            ascii += 65;
            arr[i]= (char) ascii;
        }
        return arr;
    }

    public static char[] affineDecrypt(char[] arr) {
        int inverse = 0;
        int flag = 0;

        // Find multiplicative inverse of a
        for(int i = 0; i < 26; i++) {
            flag = (inverse * i) % 26;
            if(flag == 1) {
                inverse = i;
            }
        }

        // iterate through array, perform inverse f-1(p) = (p-b)/ a mod 26
        for (int i = 0; i < arr.length; i++) {
            // Use 'A' to bring within range of ASCII
            arr[i] = (char) (((inverse * ((arr[i] + 'A' - inverse)) % 26)) + 'A');
        }
        return arr;
    }

}