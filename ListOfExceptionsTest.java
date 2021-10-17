import java.util.ArrayList;


public class ListOfExceptionsTest {

    public static void main (String[] args){

        ListOfExceptions test = new ListOfExceptions();
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        test.CastToInteger(myList);
    }


}