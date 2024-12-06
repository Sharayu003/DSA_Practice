package arrayPractice;

public class reversearray {
	
	static void reverseArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
//		int temp[] = new int[n];
//		
//		for(int i=0;i<n;i++) {
//			temp[i] = arr[n-i-1];
//		}
//		for(int i=0;i<n;i++) {
//			arr[i] = temp[i];
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,6,8};
		reverseArray(arr);
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		}

	}

}
