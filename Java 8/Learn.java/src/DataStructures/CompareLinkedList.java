package DataStructures;

public class CompareLinkedList {
    public static void main(String[] args) {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next  = null;
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(6);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(8);
        n1.next = n2;
        n2.next = null;
//        compareLists(node1, n1);
        SinglyLinkedListNode singlyLinkedListNode = mergeLists(node1, n1);
        while(singlyLinkedListNode != null){
            System.out.print(singlyLinkedListNode.data + " -> ");
           singlyLinkedListNode = singlyLinkedListNode.next;
        }
        System.out.print("Null");
    }

    static SinglyLinkedListNode linkingNodes(SinglyLinkedListNode prevList,SinglyLinkedListNode node1, SinglyLinkedListNode node2){
        SinglyLinkedListNode lastNode;
        SinglyLinkedListNode newNode1 = new SinglyLinkedListNode(node1.data);
        SinglyLinkedListNode newNode2 = new SinglyLinkedListNode(node2.data);

        if(newNode1.data< newNode2.data){
            prevList.next = newNode1;
//            newNode1.next = newNode2;
            lastNode = newNode1;
        }
        else if(newNode1.data > newNode2.data){
            prevList.next = newNode2;
//            newNode2.next = newNode1;
            lastNode = newNode2;
        }
        else{
            prevList.next = newNode1;
//            newNode1.next = newNode2;
            lastNode = newNode1;
        }
        return lastNode;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode duplicateDummy = dummy;
        while(!(node1 == null && node2 == null)){
            if(!(node1 == null || node2 == null)){
                duplicateDummy = linkingNodes(duplicateDummy, node1, node2);
            }

            else if(node1 == null || node2 == null){
                if(node1 == null){
                    while(node2 != null){
                        duplicateDummy.next = node2;
                        duplicateDummy = duplicateDummy.next;
                        node2 = node2.next;
                    }
                    duplicateDummy.next = null;
                    return dummy.next;
                }
                else{
                    while(node1 != null){
                        duplicateDummy.next = node1;
                        duplicateDummy = duplicateDummy.next;
                        node1 = node1.next;
                    }
                    duplicateDummy.next = null;
                    return dummy.next;
                }
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return dummy.next;











//        SinglyLinkedListNode lastNode = node1;
//        SinglyLinkedListNode updatedList = null;
//        while(!(node1 == null && node2 == null)){
//            if(!(node1 == null || node2 == null)){
//                updatedList = linkingNodes(lastNode, node1, node2);
//            }
//            else if(node1 == null || node2 == null){
//                if(node1 == null){
//                    while(node2 != null){
//                        updatedList.next = node2;
//                        node2 = node2.next;
//                    }
//                    return updatedList;
//                }
//                else{
//                    while(node1 != null){
//                        updatedList.next = node1;
//                        node1 = node1.next;
//                    }
//                    return updatedList;
//                }
//            }
//            node1 = node1.next;
//            node2 = node2.next;
//        }
//        return updatedList;

    }

//    Comparing two linked lists:///////////////////////////////////////////
//    static boolean isTwoNodesNull(SinglyLinkedListNode n1, SinglyLinkedListNode n2){
//        return n1 == null && n2 == null;
//    }
//
//
//    static boolean isOneOfNodeNull(SinglyLinkedListNode n1, SinglyLinkedListNode n2){
//        return n1 == null || n2 == null;
//    }
//    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//        SinglyLinkedListNode node1 = head1;
//        SinglyLinkedListNode node2 = head2;
//        if(isTwoNodesNull(head1, head2)){
//            System.out.println(1);
//            return true;
//        }
//        while(!isOneOfNodeNull(head1, head2)){
//            if(head1.data != head2.data){
//                System.out.println(0);
//                return false;
//            }
//
//            if(head1.next == null && head2.next == null){
//                System.out.println(1);
//                return true;
//            }
//            else if(head1.next == null || head2.next == null){
//                System.out.println(0);
//                return false;
//            }
//            else{
//                head1 = head1.next;
//                head2 = head2.next;
//            }
//        }
//        System.out.println(1);
//        return true;
//
//    }
//




}






class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode(int data){
        this.data = data;
    }
}