package arrayPractice;

public class CheckIsSorted {
	
	static boolean IsSorted(int arr[], int n) {
		if(n==0 || n==1) {
			return true;
		}
		for(int i=1;i<n;i++) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = {20,21,45,89,89,90};
		int n = arr.length;
		// TODO Auto-generated method stub
		if(IsSorted(arr,n)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
