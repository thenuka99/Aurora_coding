class Patient{
    int patientNo;
    int age;
    String patientName;
    String address;
    Patient next;
}
class PriorityQueue {
    private Patient head;
    private Patient tail;
    public PriorityQueue(){
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void enqueue(int patientNo, int age, String patientName, String address) {
        Patient newPatient = new Patient();
        newPatient.patientNo = patientNo;
        newPatient.age = age;
        newPatient.patientName = patientName;
        newPatient.address = address;
        if(isEmpty()){
            newPatient.next = this.tail;
            this.tail = newPatient;
            this.head = newPatient;
            return;
        }
        if(this.head.patientNo > patientNo){
            newPatient.next = this.head;
            this.head = newPatient;
            return;
        }
        if(this.tail.patientNo < patientNo){
            this.tail.next = newPatient;
            this.tail = newPatient;
            return;
        }
        Patient current = head;
        while(current.patientNo > patientNo){
            current = current.next;
        }
        newPatient.next = current.next;
        current.next = newPatient;
    }
    public String dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty. can't dequeue.");
        }
        Patient temp = this.head;
        this.head = this.head.next;
        return temp.patientName;
    }
    public String peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty. can't peek.");
        }
        return head.patientName;
    }
    public void display() {
        Patient current = head;
        while (current != null){
            System.out.println(current.patientName);
            current = current.next;
        }
    }
}