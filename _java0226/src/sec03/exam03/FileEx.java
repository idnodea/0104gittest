package sec03.exam03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir2 = new File("c://temp/images");
		dir2.mkdirs();
		
		File dir = new File("c://temp");
		File[] list = dir.listFiles();
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		for(File file : list) {
			//.out.println(file);
//			System.out.println(file.length());
//			System.out.println(file.lastModified());
			
//			System.out.print(file.getName()+"\t\t");
//			System.out.println(
//					sdf.format(new Date(file.lastModified())));
			
			System.out.print(
					sdf.format(new Date(file.lastModified()))+ "\t");
			
			if(file.isDirectory()) {
				System.out.print("<DIR>\t");
			}else {
				System.out.print(file.length()+"\t");
			}
			
			System.out.println(file.getName());
		
		}
	
	}

}
