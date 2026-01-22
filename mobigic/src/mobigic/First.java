package mobigic;

public class First {

	public static void main(String[] args) {
		int [] arr = {13, 7, 0, 1, 2, 0, 5};
		
//		int [] arr2 = new int[arr.length];
		int temp = 0;
		for(int i= 0; i <arr.length; i++) {
			for(int j =0; j < arr.length-1; j++) {
				if(arr[j] != 0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
