package com.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

/*
 * DB connection to call store procedure
 */
public class SqlDB {
	CallableStatement callableStatement = null;

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@//10.5.3.205:1521/MERCURY";
	private static final String DB_USER = "mercury";
	private static final String DB_PASSWORD = "mercury123";

	public static void main(String args[]) throws SQLException, ClassNotFoundException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;

		String getDBUSERByUserIdSql = "{call PROC_VIEW_DETAILS( '1200004', '1400004', NULL, NULL, NULL, '1100001', '1', NULL , ?)}";

		dbConnection = getDBConnection();
		callableStatement = dbConnection.prepareCall(getDBUSERByUserIdSql);

		callableStatement.registerOutParameter(1, OracleTypes.CURSOR);

		callableStatement.executeUpdate();

		ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
		ResultSetMetaData metaData = resultSet.getMetaData();

		while (resultSet.next()) {
			System.out.println(" ");
			for (int i = 1; i < metaData.getColumnCount(); i++) {
				System.out.print(resultSet.getMetaData().getColumnLabel(i) + "->" + resultSet.getString(i));
			//	System.out.println(resultSet.getMetaData().getColumnLabel(i));
			}
//			break;
		}
	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}

}
