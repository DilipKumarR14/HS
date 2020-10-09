package com.dilip.mysqll.mysqlconnect;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String CREATE_TABLE_SQL="CREATE TABLE users ("
			+ "UID INT NOT NULL,"
			+ "NAME VARCHAR(45) NOT NULL,"
			+ "DOB DATE NOT NULL,"
			+ "EMAIL VARCHAR(45) NOT NULL,"
			+ "PRIMARY KEY (UID))";
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/shoplist";
		String username = "root";
		String password = "dilip@Mysql14";

		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		try {

			conn = DriverManager.getConnection(jdbcUrl, username, password);
			stmt = conn.createStatement();

			
			
			pstmt = conn.prepareStatement("insert into users value(?,?,?,?)");
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the Id: ");
			int id=in.nextInt();
			pstmt.setInt(1, id);
			
			System.out.println("Enter the Name: ");
			String name=in.next();
			pstmt.setString(2, name);
			
			pstmt.setDate(3,  Date.valueOf((LocalDate.now())));
			
			System.out.println("Enter the email: ");
			String email=in.next();
			pstmt.setString(4, email);
			
			int psval = pstmt.executeUpdate();
			System.out.println("Data updates : "+psval);
			// getting the data
			ResultSet rs = pstmt.executeQuery("select * from users");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " "+ rs.getString(2)+" "+rs.getDate(3)+" "+rs.getString(4));
			}
			pstmt.close();

			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close connection
				if (stmt != null && pstmt !=null) {
					stmt.close();
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
