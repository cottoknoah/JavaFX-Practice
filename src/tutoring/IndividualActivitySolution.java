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

        /***** AFFINE CIPHER *****/
        // Using a = 3 and b = 5
        for (int index = 0; index < message.length; index++)
            message[index] = (char) (((message[index] - 65) * 3 + 5) % 26 + 65);

        for (int index = 0; index < message.length; index++)
        {
            if ((message[index] - 65 - 5) % 3 == 0)
                message[index] = (char) (((message[index] - 65 - 5) / 3 % 26 + 65));
            else if ((message[index] - 65 - 5 + 26) % 3 == 0)
                message[index] = (char) (((message[index] - 65 - 5 + 26) / 3 % 26 + 65));
            else if ((message[index] - 65 - 5 + 52) % 3 == 0)
                message[index] = (char) (((message[index] - 65 - 5 + 52) / 3 % 26 + 65));
        }

        for (char letter : message)
            System.out.print(letter);

        System.out.println();

        /***** BLOCK CIPHER *****/
        char[] paddedBears = new char[(int) Math.ceil(bears.length / 5.0) * 5];
        char[] swappedBears = new char[(int) Math.ceil(bears.length / 5.0) * 5];

        for (int index = 0; index < paddedBears.length; index++)
        {
            if (index < bears.length)
                paddedBears[index] = bears[index];
            else
                paddedBears[index] = 'X';
        }

        for (int index = 0; index < paddedBears.length; index++)
        {
            if (index % 5 == 0)
                swappedBears[index + 2] = paddedBears[index];
            else if (index % 5 == 1)
                swappedBears[index + 3] = paddedBears[index];
            else if (index % 5 == 2)
                swappedBears[index - 2] = paddedBears[index];
            else if (index % 5 == 3)
                swappedBears[index - 2] = paddedBears[index];
            else if (index % 5 == 4)
                swappedBears[index - 1] = paddedBears[index];
        }

        for (char letter : swappedBears)
            System.out.print(letter);

        System.out.println();
    }
}