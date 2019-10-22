import java.util.*;

class linear{
	public static int LinearSearch(int arr[],int x){
		int c=0;
			for(int i:arr){
				if(i==x){
					break;
				}
				else{
					c++;
				}
			}
			return c;
		}
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("enter the no to search");
		int x=sc.nextInt();
		int b=LinearSearch(a, x);
		System.out.println("Element found at "+b);
	}
}