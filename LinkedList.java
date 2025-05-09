// a Singly Linked List 

// Time Complexity:
// insert() - O(n) [because it traverses to the end of the list]
// printList() - O(n) [it visits each node once]

// Space Complexity: O(n), where n is the number of nodes in the linked list

public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }

            // Insert the new_node at last node
            current.next = newNode;
        }

        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current = list.head;

        // Traverse through the LinkedList
        while (current != null) {
            // Print the data at current node
            System.out.print(current.data + " ");

            // Go to next node
            current = current.next;
        }

        System.out.println(); 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}