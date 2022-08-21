package linkedListImplementation;

public class LinkedListNew {

    Node head;

    public static LinkedListNew insert(LinkedListNew list, int data){

        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {

                last = last.next;

            }
            last.next=new_node;
        }

        return list;
    }
}
