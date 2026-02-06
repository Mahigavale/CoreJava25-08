package setif;

public class Takezero {

	public static void main(String[] args) {
		
		int [] arr=new int[] {0,4,2,1,0,5,7,0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				
				if(arr[j] ==0) {
					arr[j] = arr[i];
					arr[i] = 0;
				}
			}
		}
	
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
