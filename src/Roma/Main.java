package Roma;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("reverse of \'reverse\' is "+RCooperLib.reverse( "reverse"));
        System.out.println("the version of \'04/25/01\' without slashes is "+RCooperLib.dateStr( "04/25/01"));
        System.out.println("the version of \'catatomic cat\' without the first cat is "+RCooperLib.cutOut())
    }
}
