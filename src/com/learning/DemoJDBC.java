package com.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dineshlogan", "root", "P@ssw0rd");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from order_line_item");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id") + "||" + resultSet.getString("item_name") + "||"
						+ resultSet.getString("price") + "||" + resultSet.getString("quantity"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
