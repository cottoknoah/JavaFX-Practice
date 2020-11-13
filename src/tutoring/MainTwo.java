package tutoring;


public class MainTwo {

    static int a = 3;
    static int b = 5;
    static char xorKey = 'X';

    // my message1 HELLO = KHOOR
    private static char[] message = {'H', 'E', 'L', 'L', 'O'};
    // my message2 XYZA = ABCD
    private static char[] message2 = {'X', 'Y', 'Z', 'A'};

    // my message3 HOME
    private static char[] message3 = {'H', 'O', 'M', 'E'};

    // my message4 GRIZZLY BEARS
    private static char[] message4 = {'G', 'R', 'I', 'Z', 'Z', 'L', 'Y', ' ', 'B', 'E', 'A', 'R', 'S'};

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        Decrypt decrypt = new Decrypt();
        char [] message4Encrypt = encrypt.blockEncrypt(message4);
        System.out.println("blockEncrypt: ");
        System.out.println(message4Encrypt);
        System.out.println("==========");
        System.out.println("blockDecrypt: ");
        System.out.println(decrypt.blockDecrypt(message4Encrypt));
    }

}