import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListStart{
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.add("Ray");


        iterator = names.listIterator();

        iterator.next();
        iterator.next();
        iterator.remove();

        iterator = names.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = names.listIterator(names.size());

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }





    }

}