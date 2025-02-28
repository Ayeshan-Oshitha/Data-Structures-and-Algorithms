class LinkedList {

    // Linked list Node.
    class Node {
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    // head of list
    Node head ;

    // To calculate the length of linked list
    static int count = 0;



    //  create the link list
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
        }
        count++;
    }



    // display the link list
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
        Node newNode = new Node(data);
        newNode.next = head;
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
        count++;
    }



    // insert after a given position ( After a particular node)
    public void InsertAfterPosition(int data, int position){
        if( position > count + 1){
            throw new IllegalArgumentException("Out of Linked List, Maximum position is :" + count);
        } else{
            Node newNode = new Node(data);

            Node temp = head;
            int i = 1;
            while (i < position){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
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
            newNode.next = temp.next;
            temp.next = newNode;
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

        // break the link of temp
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

        // break the link of temp ( Infact Not needed, Because last node is already null )
        temp.next = null;
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
        }else{
            Node temp = head;
            Node nextNode  ;
            int i = 1;
            while (i < position - 1){
                temp = temp.next;
                i++;
            }
            nextNode = temp.next;
            temp.next = nextNode.next;
            count--;

            // break the link of temp
            nextNode.next = null;
        }
    }

    

    // Reverse the Linked list
    public void Reverse(){
        Node prevNode,currentNode,nextNode;

        currentNode = head;
        nextNode = head;
        prevNode = null;

        while (nextNode != null){
            nextNode = nextNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }


    public static void main(String[] args){

        LinkedList list = new LinkedList();

        list.Implement(3);
        list.Implement(6);;
        list.Implement(4);
        list.Implement(7);

        list.InsertAtBeginning(1);
        list.InsertAtEnd(9);
        list.InsertAfterPosition(21,1);
        list.InsertAtPosition(31,1);

        list.DeleteFromBeginning();
        list.DeleteFromEnd();
        list.DeleteAtPosition(1);

        list.Display();

        list.Reverse();
        list.Display();

    }
}