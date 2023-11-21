import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];

        int[] newArray = myIntArray;

        modifyArray(newArray);

        newArray[0] = 10;

        System.out.println(Arrays.toString(myIntArray));

        System.out.println(Arrays.toString(newArray));

    }

    public static void modifyArray(int[] elements){

        elements[1] = 2;

    }
}