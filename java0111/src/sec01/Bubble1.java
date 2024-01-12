package sec01;

public class Bubble1 {

	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		
		for (int i = 0; i < a.length; i ++) {  //반복회수
			for (int j=0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {  //역순으로 할 때 바꾸려면 <>
					// 서로 값 바꾸기 (swap)
					int tmp = a[j]; //   
					a[j] = a[j+1];  //   
					a[j+1] = tmp;   //   
				}
			}
		}
		for (int n: a) {
			System.out.println(n+",");
		}
		System.out.println();
		
	}	

}
