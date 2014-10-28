package com.gcanalytics;

import com.gcanalytics.dao.CassandraDataSource;
import static java.lang.System.out;

public class Core {

	CassandraDataSource dataSource;
	
	public void init() {
		dataSource = new CassandraDataSource();
		final String ipAddress = "localhost";
		final int port = 9042;
		out.println("Connecting to IP Address " + ipAddress + ":" + port + "...");
	
		dataSource.connect(ipAddress, port);
	}
	
	
	
	
	public void close() {
		dataSource.close();
	}
	
}
