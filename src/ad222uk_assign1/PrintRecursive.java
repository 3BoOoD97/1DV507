package ad222uk_assign1;

public class PrintRecursive{

public static void main(String[] args) {
    String str = "Hello Everyone!";

    print(str, 0);
    System.out.println(); // Line break
    printReverse(str, 0);
}



    private static void print(String str, int pos) {
        System.out.print(str.charAt(pos));
        if (pos == str.length() - 1)         //Base case 
            return;
        print(str, pos + 1);               //Recursive call
    }

    private static void printReverse(String str, int pos) {
        System.out.print(str.charAt(str.length() - pos - 1));
        if (pos == str.length() - 1)         //Base case 
            return;
        printReverse(str, pos + 1);           //Recursive call
    }}