package mysql2;

import java.io.IOException;

public class getvalues {
	public static void get(String[] args) throws IOException {
		String user;
		user = SetReader.reading("dbuser");
		System.out.println(user);
		
	}

}
