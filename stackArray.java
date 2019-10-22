import java.util.*;
class stackArray{
	static int max=10;
		static int top=-1;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int arr[]=new int[max];
		boolean v=true;
		while(v){
			System.out.println("enter the function to perform");
		int z=s.nextInt();
			switch(z)
		{
			case 1:{
				int a=s.nextInt();
				push(arr,a);
				break;
			}
			case 2:{
				pop(arr);
				break;
			}
			case 3:{
				System.out.println(peek(arr));
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
	static void push(int arr[],int a){
		if(top<(max-1)){
			top++;
			arr[top]=a;
		}
		else{
			if(overflow()){
				System.out.println("cant put element in array");
			}
		}
	}
	static void pop(int arr[]){
		if(top>-1){
			System.out.println(arr[top]);
			arr[top]=0;
			top--;
			for(int i=0;i<=top;i++){
				System.out.println(arr[i]);
			}

			}
		else{
				System.out.println("cant pop element in array");
			}
	}
	static int peek(int arr[]){
		return arr[top];
	}
	static boolean overflow(){
		return true;
	}
	static boolean underflow(){
		return true;
	}

}