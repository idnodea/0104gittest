package sec01.exam01;

public class AOOBex {
	public static void main(String[] args) {
//		int arr = new int[] {1,2,3,4};
		int[] arr = new int[4]; //0~3까지만. 갯수.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr[4]); //4는 없다.
		System.out.println(arr[3]); //0~3
	}
}
