///*package sec01;
//
//public class JavaEx4 {
//	
//	public static void Nuren(String[] args ){
//		int a= 0;
//		int array[][]; = new array[][];
//		
//		
////		System.out.println(ti);
////		System.out.println(yi);
//	}
//	
//	public static void main(String[] args) {
//		int a[] = {3,6,7,1};
//		for(int i=0; i< a.length; i++) {
//			for(int j=0; j< a.length; j++) {
//				if([i-j]-1 < [i-j]) {
//					int temp = a[i-j]-1;
//					a[i-j]-1 = a[i-j];
//					a[i-j]=temp;
//					
//					break;
//				}
//			}
//		}
//		
//		System.out.println(a[temp]);
//	}
//	
//}
//*/
package sec01;

public class JavaEx4 {

    public static void main(String[] args) {
        int a[] = {3, 6, 7, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}