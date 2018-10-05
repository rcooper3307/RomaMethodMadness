package Roma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("reverse of \'reverse\' is "+RCooperLib.reverse( "reverse"));
        System.out.println("is \'racecar\' a palindrome? this is "+RCooperLib.isPalindrome("racecar"));
        System.out.println("the version of \'catatomic cat\' with the first \'cat\' cut out is "+RCooperLib.cutOut("catatomic cat", "cat"));
        System.out.println("the sum of the integers 0 to \'7\' is "+RCooperLib.sumUpTo(7));
    }
}
