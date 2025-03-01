class CircularLinkedList {

    // Linked list Node  .
    class Node {
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    // head & tail of list
    Node head,tail ;

    // To calculate the length of linked list
    static int count = 0;



    // create the link list
    public void Implement(int data){

        Node newNode = new Node(data);

        // If the list is empty, assign newNode to head
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        count++;
    }



    // display the linked list
    public void Display(){
        Node temp = head;
        while (true){
            System.out.print(temp.data + " ");
            temp = temp.next;

            // Break the loop if we circle back to the head
            if(temp == head){
                break;
            }
        }
        System.out.println( " \nCount is : " + count + "\n");
    }



    public static void main(String[] args){

        CircularLinkedList list = new CircularLinkedList();

        list.Implement(3);
        list.Implement(6);;
        list.Implement(4);
        list.Implement(7);

        list.Display();
    }
}
