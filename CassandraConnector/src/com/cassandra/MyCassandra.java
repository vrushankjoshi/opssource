package com.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;
import com.datastax.driver.core.Session;

public class MyCassandra {
	
	private Cluster cluster;
	 
    private Session session;
 
    public void connect(String node, Integer port) {
        Builder b = Cluster.builder().addContactPoint(node);
        if (port != null) {
            b.withPort(port);
        }
        cluster = b.build();
 
        session = cluster.connect();
    }
 
    public Session getSession() {
        return this.session;
    }
 
    public void close() {
        session.close();
        cluster.close();
    }
    
    public void loadData() {
        // insert data in the tables
        session.execute(
              "INSERT INTO auth.users (userid, first_name, last_name) " +
              "VALUES (" + "'1'," + "'Priyal'," + "'Joshi');");
    }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 MyCassandra client = new MyCassandra();
		 client.connect("192.168.99.100", Integer.valueOf(7000) );
		 client.loadData();
		 
	 }
	 
	 

}
