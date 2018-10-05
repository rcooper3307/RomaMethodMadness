package Roma;

public class RCooperLib {
    public static String reverse(String input)
    {
        String output = "";
        int i = input.length() - 1;
        while (i >=0) {
            output = output + input.substring(i,i+1);
            i--;
        }
        return output;
    }
    public static boolean isPalindrome(String input)
    {
        String out = "";
        for (int index = input.length(); index > 0 ; index--)
        {
            out = out + input.substring(index - 1, index);
        }
        if ( out.equals(input))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String cutOut(String input, String cut)
    {
        int index = input.indexOf(cut);
        String out = "";
        out = out + input.substring(0, index) + input.substring (index+ cut.length());
        return out;
    }
    public static int sumUpTo(int input)
    {
        int sum = 0;
        for(int i = 1; i < input+1; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}