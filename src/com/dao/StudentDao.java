package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	public void insertData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userSSL=false", "root", "rootroot");
		Statement st = (Statement) con.createStatement();
		st.executeUpdate("insert into student values(1,'Mahesh',25,'Pune')");
		System.out.println("Data inserted successfully");
		st.close();
		con.close();
	}

	public void UpdateData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userSSL=false", "root", "rootroot");
		Statement st = con.createStatement();
		st.executeUpdate("update student set name='Om' where id=1");
		System.out.println("Data updated successfully");
		st.close();
		con.close();
	}

	public void fetchAllRecords() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userSSL=false", "root", "rootroot");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select *from student;");
		while (rs.next()) {
			System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Age: " + rs.getInt(3)
					+ ", City: " + rs.getString(4));
		}
		rs.close();
		st.close();
		con.close();
	}

	public void deleteData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?userSSL=false", "root", "rootroot");
		Statement st = con.createStatement();
		st.executeUpdate("delete from student where id=1;");
		System.out.println("Data deleted successfully");
		st.close();
		con.close();
	}
}
