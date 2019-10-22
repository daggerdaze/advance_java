import java.util.*;

class buble{
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
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of array");
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		bubbleSort(a);
	}
}