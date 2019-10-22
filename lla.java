import java.util.*;
 class LL
{
	static Node head=null;
	static  class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
		}
	}
	public static LL insert(LL l,int d){
		Node newnode=new Node(d);
		newnode.next=null;
		Node ptr=l.head;
		if(l.head==null){
			l.head=newnode;
		}
		else{
			ptr=l.head;
			while(ptr.next!=null){
				ptr=ptr.next;
			}
			ptr.next=newnode;
		}
		return l;
	}
	public static void printList(LL l){
		Node ptr1=l.head;
		while (ptr1!=null){
			System.out.println(ptr1.data);
			ptr1=ptr1.next;
		}
	}
	public static int count_node(LL l)
	{
		int count=0;
		Node ptr=l.head;
		while(ptr!=null)
		{
			count++;
			ptr=ptr.next;
		}
		return count;
	}
	public static void mid_element(LL l,int a){
		int b=0;
		Node ptr=l.head;
		while(b!=a/2){
			ptr=ptr.next;
			b++;
		}	
		System.out.println(ptr.data);
	}
	public static void mid_elementt(LL l){
		Node ptr=l.head;
		Node ptr1=l.head;
		while(ptr1.next!=null&&ptr1.next.next!=null){
			ptr=ptr.next;
			ptr1=ptr1.next.next;
		}	
		System.out.println(ptr.data);
	}
	public static void search(LL l, int n){
		Node ptr=l.head;
		int j=1;
		while(ptr.data!=n){
			j++;
			ptr=ptr.next;
		}	
		System.out.println("Elemnent found At pos"+j);
	}
	public static LL insert_beg(LL l,int d)
	{
		Node newnode=new Node(d);
		newnode.data=d;
		newnode.next=l.head;
		l.head=newnode;
		return l;
	}
	public static LL insert_kpos(LL l,int d,int e)
	{
		Node ptr=new Node(e);
		ptr.next=null;
		Node prev=l.head;
		if(d==0){
			insert(l,e);
		}
		else{
			for(int i=0;i<d-1;i++){
				prev=prev.next;
			}
			ptr.next=prev.next;
			prev.next=ptr;
		}
		return l;
	}
	public static LL delete(LL l, int d){
		Node ptr=l.head;
		Node n=null;
		if(ptr!=null&&ptr.data==d){
			l.head=ptr.next;
			return l;
		}
		else{
			while(ptr!=null&&ptr.data!=d){
				n=ptr;
				ptr=ptr.next;
				if(ptr==null){
					return l;
				}
				else{
					n.next=ptr.next;
				}
			}
		}
		return l;	
	}
	public static LL move_last(LL l){
		Node ptr=l.head;
		Node prev=null;
		int temp;
		if(head==null){
			System.out.println("List is empty");
		}
		else if(head.next==null){
			return l;
		}
		else{
			while(ptr.next!=null){
				prev=ptr;
				ptr=ptr.next;
			}
			prev.next=null;
		ptr.next=l.head;
		head=ptr;
		}
		return l;
	}
	public static LL delete_kpos_last(LL l,int n){
		Node ptr=l.head;
		int a=0;
		if(head==null){
			System.out.println("List is empty");
		}
		else{
			while(a!=n-2){
				ptr=ptr.next;
				a++;
			}
			if(ptr.next==null){
				
			}
			Node b=ptr.next.next;
			ptr.next=b;
		}
		return l;
	}
	public static LL reverse(LL l){
		Node current=l.head;
		Node prev=null;
		Node nextt=null;
		while(current!=null){
			nextt=current.next;
			current.next=prev;
			prev=current;
			current=nextt;
		}
		l.head=prev;
		return l;
	}
	// public static Node reverserecur(Node l){
	// 	Node ptr;
	// 	if(l.next==null){
	// 		return l;
	// 	}
	// 	ptr=reverserecur(l.next);
	// 	l.next.next=ptr;
	// 	ptr.next=null;
	// 	return ptr;
	// }
	// public static LL reverseRecursively(LL l){
 //        Node headd =l.head;
 //        headd=reverserecur(headd);
 //        return l;
 //  	} 
	public static boolean isPalindrome(Node head) {
	    if(head == null){
	        return true;
	    }
	    Node p = head;
	    Node prev = new Node(head.data);
	    while(p.next != null){
	        Node temp = new Node(p.next.data);
	        temp.next = prev;
	        prev = temp;
	        p = p.next;
	    }
	    Node p1 = head;
	    Node p2 = prev;
	    while(p1!=null){
	        if(p1.data != p2.data)
	            return false;
	 
	        p1 = p1.next;
	        p2 = p2.next;
	    }
    return true;
	}
	public static void Pall(LL l){
		boolean b=isPalindrome(l.head);
		System.out.println(b);
	}
}

class lla
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
boolean v=true;
LL obj1=new LL();
	while(v){
			System.out.println("enter the function to perform \n1:to insert\n2:to print mid element\n3:to count no of nodes\n4:to printlist \n5:to print mid after counting nodes\n6:to search element\n7:to insert in begining\n8:to insert at k position\n9:to delete\n10:move last element to first\n11:to delete at particular pos from back\n12:reverse a list\n13:reverse a list using recursion\n14:to check pallindrome");
		int z=s.nextInt();
			switch(z)
		{
			case 1:{
				int a=s.nextInt();
				obj1.insert(obj1,a);
				break;
			}
			case 2:{
				obj1.mid_elementt(obj1);
				break;
			}
			case 3:{
				int a= obj1.count_node(obj1);
				System.out.println(a);
				break;
			}
			case 4:{
				obj1.printList(obj1);
				break;
			}
			case 5:{
				int a= obj1.count_node(obj1);
				obj1.mid_element(obj1 ,a);
				break;
			}
			case 6:{
				System.out.println("Enter element to search");
				int n=s.nextInt();
				obj1.search(obj1,n);
				break;
			}
			case 7:{
				int c=s.nextInt();
				obj1.insert_beg(obj1,c);
				break;
			}
			case 8:{
				System.out.println("enter the pos at which data to added");
				int d=s.nextInt();
				System.out.println("enter the data");
				int f=s.nextInt();
				obj1.insert_kpos(obj1,d,f);
				break;
			}
			case 9:{
				System.out.println("enter the data to delete");
				int r=s.nextInt();
				obj1.delete(obj1,r);
				break;
			}
			case 10:{
				obj1.move_last(obj1);
				obj1.printList(obj1);
				break;
			}
			case 11:{
				System.out.println("Enter the position");
				int n=s.nextInt();
				obj1.delete_kpos_last(obj1,n);
				break;
			}
			case 12:{
				obj1.reverse(obj1);
				break;
			}
			case 13:{
				//obj1.reverseRecursively(obj1);
				//System.out.println(obj1);
				break;
			}
			case 14:{
				obj1.Pall(obj1);
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