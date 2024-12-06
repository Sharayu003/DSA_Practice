package arrayPractice;

public class Secondlargestelement {
	// Better approach
	static int getSecondlargestelement(int arr[]){
		int n = arr.length;
		
		int largest = -1, secondlargest = -1;
		
		for(int i=0;i<n;i++) {
			if(arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			}
			
			else if(arr[i]<largest && arr[i]>secondlargest) {
				secondlargest = arr[i];
			}
			
		}
		return secondlargest;
		
	}
//		int n = arr.length;
//		
//		int largest = -1, secondlargest = -1;
//		
//		for(int i=0;i<n;i++) {
//			if(arr[i]>largest) {
//				largest = arr[i];
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			if(arr[i]>secondlargest && arr[i]!=largest) {
//				secondlargest = arr[i];
//			}
//		}
//		return secondlargest;
//	}
	
	public static void main(String[] args) {
		int arr[] = {12,35,1,10,34,1};
		System.out.println(getSecondlargestelement(arr));
	}

}
