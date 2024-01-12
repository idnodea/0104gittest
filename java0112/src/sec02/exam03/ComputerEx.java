package sec02.exam03;

public class ComputerEx {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3,};    
		int result1= myCom.sum1(values1);
		System.out.println("result1:"+result1);
		
		int result2=myCom.sum1(new int[] {1,2,3,4,5}); //콜바이밸류
		System.out.println("result2:"+result2);
		
		int result3 = myCom.sum2(1,2,3); //
		System.out.println("result3:"+result3);
		
		int result4 =myCom.sum2(1,2,3,4,5,6,7);
		System.out.println("result4:"+result4);

	  }
	}
//	
//	int sum1(int[] values) {   //콜바이레퍼런스 값x 주소복사  
//		int sum=0;
//		for(int val: values) {
//			sum+= val;
//		}
//		return sum;
//	}
//	int sum2(int ... values) {   [] 대신 ...
//		int sum=0;
//		for(int val : values) {
//			sum+= val;
//		}
//		for(int i=0;  i<values.length; i++){
//			sum+= values[i];
//		}
//	}
//	return sum;
//
//}
