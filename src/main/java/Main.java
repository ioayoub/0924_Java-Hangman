import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        int myNumber= 2;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBool = true;
        String firstName = "toto";

        int[] myIntArr = { 1,2,3,4 };

        ArrayList<String> myStringList = new ArrayList<String>();

        myStringList.add("toto");
        myStringList.add("tata");

        Person toto = new Person("toto", "des familles", 49);

        System.out.println(toto.toString());

    }
}
