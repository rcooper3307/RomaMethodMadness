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
}
public class RCooperLib{
    public static String dateStr (String date){
      String outDate = date;
     for (int index = outDate.indexOf("/"); index < date.length(); index =  outDate.indexOf("/") )
      outDate = outDate.substring(0,index) + "-" + outDate.substring(index);
        }
        return
    }
}
