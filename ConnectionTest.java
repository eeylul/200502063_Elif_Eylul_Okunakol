package com.know.jdbc;


import java.sql.*;
//import com.microsoft.sqlserver.jdbc.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;



public class ConnectionTest {

	public static void main(String[] args) {
		
		// Declare the JDBC objects.

		Connection con = null;

		Statement stmt = null;

		ResultSet rs = null;


		// Create a variable for the connection string.

		
		try {

			// Establish the connection.
			SQLServerDataSource ds = new SQLServerDataSource();
			ds.setIntegratedSecurity(true);
			ds.setSeverName("localhost");
			ds.setPortnumber(3306);
			ds.setDatabaseName("Connectlegaltask");
			con = ds.getConnection();
			

			//Execute a stored procedure that returns some data.
			//cstmt = con.prepareCall("{call dbo.uspGetEmployeeManagers(?)}");
			//cstmt.setInt(1,50);
			//rs = cstmt.executeQuery();
					//con = DriverManager.getConnection(connectionUrl);

					// Create and execute an SQL statement that returns

					//String SQL = "SELECT TOP 10 * FROM Person.Contact";


			// Iterate through the data in the result set and display it:

			while (rs.next()){

				System.out.println("EMPLOYEE:" + rs.getString("LastName") + "" + rs.getString(6));

			}

		}

		// Handle my errors that have occurred.

			catch (Exception e) {
				
			}
	}
}



        