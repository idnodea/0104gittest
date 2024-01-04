package sec03.exam01;

public class Continue {

	
		public static void main(String[] args) throws Exception{
			int keyCode;
			
			while(true) {
				keyCode = System.in.read();
				System.out.println("keyCode:"+keyCode);
			}
		}

	

}
