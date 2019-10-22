import java.util.*;

class binary{
	public static void bubbleSort(int arr[]){
		
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					int temp=0;
					if(arr[j]<arr[i]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		public static int bianrySearch(int arr[],int a,int n,int s){
				while(s<n){
					int mid=n+s/2;
					if(arr[mid]==a)
					{
						return mid;
					}
					else if(arr[mid]>a){
						n=mid-1;
						return bianrySearch(arr,a,n,s);
					}
					else if(arr[mid]<a){
						s=mid+1;
						return bianrySearch(arr,a,n,s);
					}
				}
					return -1;
			}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of array");
		for (int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		bubbleSort(a);
		System.out.println("enter the elements to search");
			int br=s.nextInt();
			int x=bianrySearch(a,br,n-1,0);
			if(x==-1){
				System.out.println("Element not found");
			}
			else{
				System.out.println("Element found at pos"+x);
			}
	}
}