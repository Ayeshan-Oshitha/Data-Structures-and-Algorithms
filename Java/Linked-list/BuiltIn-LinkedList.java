import java.util.Iterator;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("John");
        linkedList.add("Joe");
        linkedList.add("Root");
        linkedList.add("Max");
        System.out.println( " Linked list is : " + linkedList);

        linkedList.addFirst("Morgan"); // add at beginning
        linkedList.addLast("Starc"); // add at end
        linkedList.add(2,"Diana"); // add at index

        LinkedList<String> tempList = new LinkedList<>();
        tempList.add("Smith");

        linkedList.addAll(tempList); // add one Linked List to another

        linkedList.remove("Max"); // remove element
        linkedList.removeFirst(); // remove from beginning
        linkedList.removeLast(); // remove from end
        linkedList.remove(2); // remove from index
        linkedList.clear(); // empty linked list



        LinkedList<Integer> numlinkedList = new LinkedList<>();
        numlinkedList.add(1);
        numlinkedList.add(4);
        numlinkedList.add(3);
        numlinkedList.add(6);
        numlinkedList.add(9);
        numlinkedList.add(8);

        // Forward Traversal - Method 01
        System.out.print("Forward Traversal: ");
        for (int num : numlinkedList) {
            System.out.print(num + " ");
        }

        // Backward Traversal - Method 01
        System.out.print("Backward Traversal: ");
        for (int i = numlinkedList.size() - 1; i >= 0; i--) {
            System.out.print(numlinkedList.get(i) + " ");
        }

        // Forward Traversal - Method 02
        Iterator<Integer> iterator = numlinkedList.iterator();
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward Traversal - Method 02
        Iterator<Integer> descendingIterator = numlinkedList.descendingIterator();
        System.out.println("Backward Traversal:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

     }
}