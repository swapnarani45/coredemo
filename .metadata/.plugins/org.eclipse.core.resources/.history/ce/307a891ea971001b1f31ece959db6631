package com.vam.training.OracleDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDemo {

	public static void main(String[] args) {
		Statement stmt;
		Connection con;
		ResultSet rs;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3) + "\t" + rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
