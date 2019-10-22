import java.util.*;
class RduplicateArray{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int j=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j]=arr[i+1];
				j++;
			}
		}
		for(int i=0;i<j;i++){
			System.out.print(arr[i]+" ");
		}
	}
}