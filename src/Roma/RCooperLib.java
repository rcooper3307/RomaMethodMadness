package Roma;

public class RCooperLib {
    public static String isPalindrome(String input) {
        String out = ""; //this variable is a string being used to build the word backwards
        for (int index = input.length(); index > 0; index--) {
            out = out + input.substring(index - 1, index); //the index starts at input.length() to get the last character first
        }
        if (out.equals(input)) { //if the reverse of the input equals the input, it returns true, and if it doesn't, false
            return "True";
        } else {
            return "False";
        }
    }

    public static String cutOut(String mainStr, String subStr) {
        int index = mainStr.indexOf(subStr); //this locates the index of the substring
        String out = ""; //this creates a blank string that will be used to create the new string
        out = out + mainStr.substring(0, index) + mainStr.substring(index + subStr.length()); //this cuts out the subStr
        return out;
    }

    public static int sumUpTo(int input) {
        int sum = 0; //the sum of the numbers starts at zero
        for (int i = 1; i < input + 1; i++) { //the first number being added is one, so i starts at one and is increased incrementally
            sum = sum + i; //i is added to the sum of the numbers before it each time
        }
        return sum;
    }
    public static String  primePrinter(int num){
        String out = "";
        int primeNum = 2; //2 is the first prime number, so primeNum starts at 2
        for (int i = 0; i <= num; primeNum++)  //i is equal to the number of numbers that you've printed so far, and primeNum increases regardless of whether the number it's on is a prime number, because it's testing all of them
        {
            int factorCount = 0; //count is the number of factors a given number has
            for (int factorNum = 1; factorNum <= primeNum; factorNum++)//factorList lets me go up the list of numbers to find the total number of factors until factorNum = primeNum
            {
                if (primeNum % factorNum == 0) {
                    factorCount++;
                }
            }
            if (factorCount == 2)  //if the total number of factors that the number has is equal to 2, that number is printed
            {
                out = out + primeNum + " "; //this adds a space next to the numbers so the next number isn't squished up all close
                i++; // i only increases when you find a prime number
            }
        }
        return out;
    }
}
