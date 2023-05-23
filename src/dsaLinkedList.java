public class dsaLinkedList {

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    static Node head = null;
    Node tail = null;
    static dsaLinkedList dl = new dsaLinkedList();
    public Node addNodeToLinkedList(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.next=null;
            tail=newNode;
        }
        return head;
    }

    public void printAllNodes(){
        Node current=head;
        while(current!=null){
            System.out.print(current.val+",");
            current=current.next;
        }
    }

    public boolean checkValuePresence(int checkValue){
        Node current=head;
        boolean flag=false;
        while(current!=null){
            if(current.val==checkValue){
                System.out.print("\nValue present:::::: "+current.val+",");
                flag=true;
                break;
            }

            current=current.next;
        }
        return flag;
    }

    public Node addNodeatBegening(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void main(String[] args){

        dl.addNodeToLinkedList(121);
        dl.addNodeToLinkedList(21);
        dl.addNodeToLinkedList(11);
        dl.addNodeToLinkedList(12);

        dl.printAllNodes();
        boolean flag = dl.checkValuePresence(11);
        if(!flag){
            System.out.println("\nElement was not present in the linkedlist");
        }

        head = dl.addNodeatBegening(23);
        System.out.println();

        dl.printAllNodes();
        dl.addNodeafterGivenValue(21, 22);
        dl.printAllNodes();
        System.out.println();
        dl.addNodeatGivenIndex(2, 56);
        dl.printAllNodes();
        System.out.println();
        dl.removelastnode();
        dl.printAllNodes();
        System.out.println();
        dl.removefirstnode();
        dl.printAllNodes();
        System.out.println();
        dl.removeNodeFromASpecificIndex(3);
        dl.printAllNodes();
        System.out.println();
//        System.out.println("Remove all Even Numbers below");
//        dl.removeAllEvenNumber();
//        dl.printAllNodes();
//        System.out.println();
        dl.reversedLinkedList();
        dl.printAllNodes();

    }

    public void addNodeafterGivenValue(int afterValue, int addValue){
        boolean flag = false;
        Node newNode = new Node(addValue);
        Node current = head;
        while(current!=null){
            if(current.val==afterValue){
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                flag=true;
                break;
            }
            current= current.next;
        }
        if(flag){
            System.out.println("New node added after getting node value of :::"+afterValue);
        }else{
            System.out.println(afterValue+" was not found in the linkedlist");
        }
    }

    public void addNodeatGivenIndex(int index, int addValue){
        Node newNode = new Node(addValue);
        int count =1;
        Node current = head;
        while((current!=null) && (count == index-1)){
            count=count+1;
            current=current.next;
        }
        Node temp = current.next;
        current.next=newNode;
        newNode.next=temp;
    }

    public void removelastnode(){
        Node current=head;

        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
    }

    public void removefirstnode(){
        head=head.next;
    }

    public void removeNodeFromASpecificIndex(int index){
        Node current = head;
        int count = 1;
        while((current.next!=null) && (count-1==index)){
            current=current.next;
            count++;
        }
        current.next=current.next.next;
    }

    public void removeAllEvenNumber(){
        Node current = head;
        Node previous = null;
        while(current.next!=null){
            if((current.val%2)==0){
                    previous = current;
                    current=current.next;
                previous.next=current.next;
            }
            current = current.next;
        }
    }

    public void reversedLinkedList(){
        Node current = head;
        Node next = null;
        Node previous = null;
        while(current.next!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
    }


}
