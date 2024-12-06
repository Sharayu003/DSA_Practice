package arrayPractice;

public class thirdlargest {
	static void print3largest(int arr[], int arr_size) 
	{
		int i, first, second, third;
		
		if(arr_size < 3) {
			System.out.println("Invalid input");
			return;
		}
		
		third = second = first=Integer.MIN_VALUE;
		
		for(i=0;i<arr_size;i++) {
			if(arr[i]>first) {
				third = second;
				second = first;
				first = arr[i];
			}
			
			else if(arr[i]>second) {
				second = first;
				first = arr[i];
			}
			
			else if(arr[i]>third) {
				third = arr[i];
			}
		}
		System.out.println("Three Largest numbers "+first+" "+second+" "+third);
		//return first,second,third;(error : Syntax error on token "return", void expected)
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,13,1,10,34,1};
		int n= arr.length;
		print3largest(arr,n);

	}

}
