package com.dilip.postgres.postgresscrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author postgresqltutorial.com
 */
public class App{
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/postgres",
							"postgres", "dilip@Post14");
			stmt = c.createStatement();
	         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	                 + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
	              stmt.executeUpdate(sql);

	              sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	                 + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
	              stmt.executeUpdate(sql);

	              sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	                 + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
	              stmt.executeUpdate(sql);

	              sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	                 + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
	              stmt.executeUpdate(sql);
	              
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
}
