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
    public static String dateStr (String date)
    {
        String outDate = date;
        for (int i = outDate.indexOf("/"); i < date.length(); i = outDate.indexOf("/")) {
            outDate = outDate.substring(0, i) + "-" + outDate.substring(i);
        }
        return outDate;
    }
}
