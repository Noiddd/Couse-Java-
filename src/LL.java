import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Singapore");
        placesToVisit.add("Malaysia");
        placesToVisit.add("Thailand");
        placesToVisit.add("Korea");
        placesToVisit.add("Japan");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Spring");
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){ // hasNext shows if there is another entry
            System.out.println("Now visiting " + i.next()); // .next() returns current entry and move to the next
        }
        System.out.println("--------------");
    }


}
