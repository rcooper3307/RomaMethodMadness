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
        String outDate = "";
        for (int i = date.indexOf("/"); i < date.length(); i = date.indexOf("/")) {
            outDate = date.substring(0, i) + "-" + date.substring(i);
        }
        return outDate;
    }
    public static String cutOut( String mainStr, String subStr){
        int index = mainStr.indexOf(subStr);
        String out = "";
        out = out + mainStr.substring(0, index) + mainS
    }
}