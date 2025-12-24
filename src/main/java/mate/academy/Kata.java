package mate.academy;

public class Kata
{
    public static int DontGiveMeFive(int start, int end)
    {
        int count = 0;

        for (int i = start; i <= end; i++)
        {
            if (!Integer.toString(i).contains("5"))
            {
                count++;
            }
        }

        return count;
    }
}