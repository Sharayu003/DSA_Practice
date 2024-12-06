package arrayPractice;

import java.util.HashSet;

public class removeDuplicate {
	static int removeDup(int arr[]) {
		 HashSet<Integer> hs = new HashSet<>();
		 int idx = 0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(!hs.contains(arr[i])) {
				 hs.add(arr[i]);
				 arr[idx++] = arr[i];
			 }
		 }
		 return idx;
	}

	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDup(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
