public class VarArg {

    public static void main(String... args) {

        String[] text = "Hello World again".split(" ");

        printArray(text);

        System.out.println("-".repeat(20));

        printArray("Hello", "wold", "again");

        System.out.println("-".repeat(20));

        printArray();

        String[] sArray = {"first", "second", "Third", "fourth", "fifth"};

        System.out.println(String.join("," , sArray));


    }

    public static void printArray(String... data){

        for (String t: data) {

            System.out.println(t);


        }

    }
}
