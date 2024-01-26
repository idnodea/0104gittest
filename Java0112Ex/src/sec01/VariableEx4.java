package sec01;

public class VariableEx4 {

	public void main(String[] args) {
		int v1 =0;
		if(true) {
			int v2 = 0;
			int v3 = 0;
			if(true) {
//				int v3 = 0;
				v1=1;
				v2=1;
				v3=1;
			}
			v1=v2+v3;  //v3값이 블록 범위 밖임  ->블록안으로
		}System.out.println(v1);
	} 
	
}
