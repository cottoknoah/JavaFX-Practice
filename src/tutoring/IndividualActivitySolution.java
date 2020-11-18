package tutoring;

public class IndividualActivitySolution
{
    public static void main(String[] args)
    {
        char[] message = { 'M', 'E', 'E', 'T',
                'M', 'E',
                'I', 'N',
                'T', 'H', 'E',
                'P', 'A', 'R', 'K' };

        char[] bears = { 'G', 'R', 'I', 'Z', 'Z', 'L', 'Y',
                'B', 'E', 'A', 'R', 'S' };

        /***** CAESAR CIPHER *****/
        for (int index = 0; index < message.length; index++)
            message[index] = (char) ((message[index] - 65 + 3) % 26 + 65);

        for (int index = 0; index < message.length; index++)
            message[index] = (char) ((message[index] - 65 - 3) % 26 + 65);

        for (char letter : message)
            System.out.print(letter);

        System.out.println();

        for (char letter : swappedBears)
            System.out.print(letter);

        System.out.println();
    }
}