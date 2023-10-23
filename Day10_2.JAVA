class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedList{
	Node head;
	
	public boolean Search(int key) {
		Node current=head;
		while(current !=null) {
			if(current.data==key) {
				return true;
				
			}
			current = current.next;
		}
		return false;
	}
	public void insert(int data) {
		Node newNode=new Node(data);
		if(heah ==null) {
			head=newNode;
		}else {
			Node current=head;
			while(current.next !=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	public void delete(int key) {
		if(head == null) {
			return;
		}
		if(head.data==key) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data != key) {
			current=current.next;
		}
		if(current.next!=null) {
			current.next=current.next.next;
		}
	}
	public void update(int oldData,int newData) {
		Node current=head;
		while(current!=null) {
			if(current.data==oldData) {
				current.data=newData;
				return;
			}
			current=current.next;
		}
	}
}
public class Day10_2 {
	public static void main(String[] args) {
		Day10_2 d=new Day10_2();
		LinkedList ll=new LinkedList();
		ll.insert(key);
	}

}
