package arrayPractice;

public class maxElement {
	static int arr[] = {10,324,45,90,9808};
	
	static int largest() {
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest Element in array "+largest());

	}

}
