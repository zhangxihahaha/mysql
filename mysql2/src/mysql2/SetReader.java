package mysql2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SetReader {

	public static String reading(String keys) throws IOException {

		String getset;
		Properties properties = new Properties();
		FileReader fReader = new FileReader("conf/hei.porperties");
		BufferedReader bufferedReader = new BufferedReader(fReader);
		properties.load(bufferedReader);
		getset = properties.getProperty(keys);
		return getset;

	}

}
