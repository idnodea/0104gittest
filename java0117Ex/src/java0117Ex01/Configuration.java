package java0117Ex01;

public class Configuration {
	
	private static Configuration configuration;
	
	private Configuration() {}
	
	public static Configuration getInstance() {
			
			if(null == configuration) {
				configuration = new Configuration();
			}
			return configuration;
	}
	
	
}
