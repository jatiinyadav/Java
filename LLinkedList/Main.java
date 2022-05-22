package LLinkedList;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.insertBeg(90);

        list.insertEnd(87);

        list.insertAtPos(0, 78);
        list.display();

        System.out.println();
        
        list.deleteAtPos(3);
        list.display();
        
        System.out.println();
        System.out.println(list.find(78));
        // SingleLL list = new SingleLL();
        // list.insertAtBeg(20);
        // list.insertAtBeg(30);

        // list.insertAtEnd(90);

        // list.insertAtPos(20, 69);
        // list.display();

    }
}
