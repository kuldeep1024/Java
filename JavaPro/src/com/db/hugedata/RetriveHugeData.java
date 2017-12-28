package com.db.hugedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveHugeData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ws711", "root", "root");

			Statement stmt = con.createStatement();
			
			con.setAutoCommit(false);
			stmt.setFetchSize(1000);
			
			long startTime = System.currentTimeMillis();
			ResultSet rs = stmt.executeQuery("select * from household");
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			

			long p_startTime = System.currentTimeMillis();
			while (rs.next()){
				//rs.getString(1);
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			}
			long p_endTime = System.currentTimeMillis();
			long p_duration = (p_endTime - p_startTime);
			
			System.out.println("total execution time : "+duration/1000);
			System.out.println("total proceessing time : "+p_duration/1000);
			
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
