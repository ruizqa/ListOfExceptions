import java.util.ArrayList;
//public class ClassCastException extends Exception{}
public class ListOfExceptions{

    public void CastToInteger(ArrayList<Object> myList){
        
        for(int i = 0; i < myList.size(); i++) {
            try{ Integer castedValue = (Integer) myList.get(i);}
            catch(ClassCastException e){
                System.out.println(String.format("Index %s: %s",i,myList.get(i)));
            }
        }

    }


}