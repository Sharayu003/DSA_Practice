package arrayPractice;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class leaderElement {

	static ArrayList<Integer> leader(int arr[]){
		
	ArrayList<Integer> result = new ArrayList<>();
	int n = arr.length;
	int maxright = arr[n-1];
	for(int i=n-2;i>=0;i--) {
		if(arr[i]>maxright) {
			maxright = arr[i];
			result.add(maxright);
		}
	}
	Collections.reverse(result);
	return result;
	}
	public static void main() {
		int arr[] = {16,17,3,4,5,2};
		ArrayList<Integer> result = leader(arr);
		for(int res : result) {
			System.out.print(res +" ");
		}
		System.out.println();
		
	}
}
