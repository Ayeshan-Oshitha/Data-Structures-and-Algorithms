class DoublyLinkedList {

    // Linked list Node  .
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d){
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }

    // head of list
    Node head ;

    // To calculate the length of linked list
    int count = 0;



    // create the link list
    public void Implement(int data){

        Node newNode = new Node(data);
        Node temp;

        // If the list is empty, assign newNode to head
        if(head == null){
            head = newNode;
        }else{
            temp = head;
            // Traverse to the last node and add the new node
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        count++;
    }



    // display the linked list
    public void Display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( " \nCount is : " + count + "\n");
    }



    // insert from beginning
    public void InsertAtBeginning(int data){
        // This code block doesn't handle the case when Linked list is empty
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        count++;
    }



    // insert from end
    public void InsertAtEnd(int data){
        Node newNode = new Node(data);
        newNode.next = null;

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

        count++;
    }



    // insert after a given position ( After a particular node)
    public void InsertAfterPosition(int data, int position){
        if( position > count ){
            throw new IllegalArgumentException("Out of Linked List, Maximum position is :" + count);
        } else if (position == 4) {
            InsertAtEnd(data);
        } else{
            Node newNode = new Node(data);

            Node temp = head;
            int i = 1;
            while (i < position){
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            newNode.next = temp.next;
            newNode.prev = nextNode.prev;
            temp.next = newNode;
            nextNode.prev = newNode;
            count++;
        }
    }



    // insert At a given position (Before a particular node )
    public void  InsertAtPosition(int data, int position){
        if( position > count ){
            throw new IllegalArgumentException("Out of Linked List, Maximum position is :" + count);
        } else if (position == 1) {
            InsertAtBeginning(data);
        } else  {
            Node newNode = new Node(data);

            Node temp = head;
            int i = 1;
            while (i < position - 1){
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            newNode.next = temp.next;
            newNode.prev = nextNode.prev;
            temp.next = newNode;
            nextNode.prev = newNode;
            count++;
        }
    }



    // Delete from Beginning
    public void DeleteFromBeginning(){
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        Node temp = head;
        head = head.next;
        count--;

        // break the link of temp(deleted Node)
        temp.next = null;
    }



    // Delete from End
    public void DeleteFromEnd(){
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        Node temp = head;
        Node prevNode = head  ;
        while (temp.next != null){
            prevNode = temp;
            temp = temp.next;
        }

        if(temp == head){
            // If Linked list have only 1 Node
            head = null;
        }else{
            prevNode.next = null;
        }
        count--;

        // break the link of Temp (deleted Node)
        temp.prev = null;
    }



    // Delete From a Position
    public void DeleteAtPosition(int position){
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        } else if( position > count ){
            throw new IllegalArgumentException("Out of Linked List, Maximum position is :" + count);
        } else if (position == 1) {
            DeleteFromBeginning();
        } else if (position == count) {
            DeleteFromEnd();
        } else{
            Node temp = head;

            int i = 1;
            while (i < position ){
                // traverse to position
                temp = temp.next;
                i++;
            }
            Node nextNode = temp.next;
            Node prevNode = temp.prev;
            prevNode.next = temp.next;
            nextNode.prev = temp.prev;
            count--;

            // break the link of temp(deleted Node)
            temp.next = null;
            temp.prev = null;
        }
    }




    // Reverse the Linked list
    public void Reverse(){

       Node currentNode = head;
       Node nextNode = null;

      Node tail = head;
      // Find the last node of linked list
      while (tail.next != null){
          tail = tail.next;
      }

       while(currentNode != null){
           nextNode = currentNode.next;
           currentNode.next = currentNode.prev;
           currentNode.prev = nextNode;
           currentNode = nextNode;
       }

        head = tail;
    }


    
    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();

        list.Implement(3);
        list.Implement(6);;
        list.Implement(4);
        list.Implement(7);

        list.Display();

        list.InsertAtBeginning(1);
        list.InsertAtEnd(9);
        list.InsertAfterPosition(21,4);
        list.InsertAtPosition(31,3);

        list.DeleteFromBeginning();
        list.DeleteFromEnd();
        list.DeleteAtPosition(3);
        
        list.Reverse();
        list.Display();
    }
}
