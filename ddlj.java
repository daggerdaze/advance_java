import java.util.*;
 class DLL
{
	static Node head=null;
	static Node tail=null;
	static  class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			this.data=d;
			next=null;
			prev=null;
		}
	}
	public static DLL insert_beg(DLL l,int d){
		Node newnode=new Node(d);
		if(l.head==null){
			l.head=newnode;
			l.tail=newnode;
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
		return l;
	}
	public static DLL insert_last(DLL l,int d){
		Node newnode=new Node(d);
		if(l.head==null){
			l.head=newnode;
			l.tail=newnode;
		}
		else{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
		return l;
	}
	public static void printList(DLL l){
		Node ptr=l.head;
		while (ptr!=null){
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
	public static void delete_last(){
		if(tail==null){
			System.out.println("List is empty");
		}
		else{
			tail=tail.prev;
			tail.next=null;
		}
	}
	public static void delete_beg(){
		if(head==null){
			System.out.println("List is empty");
		}
		else if(head.next!=null){
			head=head.next;
			head.prev=null;

		}
	}
	public static void delete_pos(int a){
		Node ptr=l.head;
		if(tail==null){
			System.out.println("List is empty");
		}
	}
	// public static DLL delete_beg(DLL l){
	// 	Node ptr=l.head;
	// 	Node n=null;
	// 	if(head==null){
	// 		System.out.println("List is empty");
	// 	}
	// 	else{
	// 		while(ptr!=null&&ptr.data!=d){
	// 			n=ptr;
	// 			ptr=ptr.next;
	// 			if(ptr==null){
	// 				return l;
	// 			}
	// 			else{
	// 				n.next=ptr.next;
	// 			}
	// 		}
	// 	}
	// 	return l;	
	// }
}

class ddlj
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
boolean v=true;
DLL obj1=new DLL();
	while(v){
			System.out.println("enter the function to perform \n1:to insertion begining\n2:toinsert at last\n3:to delete from last\n4:to delete from begining\n5:to delete at position\n6:to print dDLL\n7:exit");
		int z=s.nextInt();
			switch(z)
		{
			case 1:{
				int a=s.nextInt();
				obj1.insert_beg(obj1,a);
				break;
			}
			case 2:{
				int a=s.nextInt();
				obj1.insert_last(obj1,a);
				break;
			}
			case 3:{
				obj1.delete_last();
				break;
			}
			case 4:{
				obj1.delete_beg();
				break;
			}
			case 5:{
				int a=s.nextInt();
				obj1.delete_pos(a);
				break;
			}
			case 6:{
				obj1.printList(obj1);
				break;
			}
			default:{
				System.out.println("GOOD BYE");
				v=false;
			break;
			}

		}
	}
}	
}