package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	String columnValue;

	public String getData(String columnName) {
//  Setting properties for mySql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/july2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String query = "select * from users;";

//     create connection to local database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

//Empowering the connection reference variable to execute
			statement = connection.createStatement();
// Delivering the query
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {

				columnValue = resultSet.getString(columnName);
				return columnValue;

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {

				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		return columnValue;

	}
}
