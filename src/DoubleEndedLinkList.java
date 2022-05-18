class Node {
    int data;
    Node next;
    Node(int item) {
        this.data = item;
    }
    void displayNode() {
        System.out.println(this.data+" ");
    }
}
class DoubleEndedLinkList {
    private Node head;
    private Node tail;
    public void LinkList() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return this.head == null;
    }
    public void insertFirst(int i) {
        Node nNode = new Node(i);
        if(isEmpty()){
            nNode.next = this.tail;
            this.tail = nNode;
            this.head = nNode;
            System.out.println("Insert First operation complete.");
            return;
        }
        nNode.next = this.head;
        this.head = nNode;
        System.out.println("Insert First operation complete.");
    }
    public void insertEnd(int i) {
        Node nNode = new Node(i);
        if(isEmpty()){
            nNode.next = this.tail;
            this.tail = nNode;
            this.head = nNode;
            System.out.println("Insert End operation complete.");
            return;
        }
        this.tail.next = nNode;
        this.tail = nNode;
        System.out.println("Insert End operation complete.");
    }
    public void insert(int i, int key) {
        Node nNode = new Node(i);
        if(isEmpty()){
            nNode.next = this.tail;
            this.tail = nNode;
            this.head = nNode;
            System.out.println("Insert operation complete.");
            return;
        }
        Node presentNode = this.head;
        int j=1;
        while (presentNode != null){
            if(j == key-1){
                nNode.next = presentNode.next;
                presentNode.next = nNode;
                System.out.println("Insert operation complete.");
                return;
            }
            presentNode = presentNode.next;
            i++;
        }
        System.out.println("Unable to find key.");
    }
    public Node deleteFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty. unable to delete values.");
        }
        Node tempNode = this.head;
        this.head = this.head.next;
        return tempNode;
    }
    public void displayList() {
        Node presentNode = this.head;
        while (presentNode != null){
            presentNode.displayNode();
            presentNode = presentNode.next;
        }
    }
    public Node find(int key) throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty. unable to find values.");
        }
        if(key == 1){
            return this.head;
        }
        int i = 2;
        Node presentNode = this.head.next;
        while(presentNode != null){
            if(i == key){
                return presentNode;
            }
            presentNode = presentNode.next;
            i++;
        }
        throw new Exception("Item not found in list.");
    }
    public void delete(int key) throws Exception {
        if (isEmpty()){
            throw new Exception("List is empty. Don't have values to delete.");
        }
        if(key == 1){
            this.head = this.head.next;
            System.out.println("Delete operation complete.");
        }
        int i = 2;
        Node presentNode = this.head.next;
        Node previousNode = this.head;
        while (presentNode != null){
            if(i == key){
                previousNode.next = presentNode.next;
                System.out.println("Delete operation complete.");
            }
            presentNode = presentNode.next;
            previousNode = previousNode.next;
            i++;
        }
        throw new Exception("List item not found.");
    }
}