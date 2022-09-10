package com.informationasset.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.informationasset.constants.Datasource_Name;
import com.informationasset.constants.DriverClass;
import com.informationasset.entity.Database_Model;

public class Connect {
	static Database_Model model=new Database_Model();
	public ResultSet ConnectWithoutProperties(String dsname, String driverClass,String hostName, int portNo,String databaseName, String userName,String Password,String sqlQuery)
	{
		ResultSet rs=null;
		try
		{
			Class.forName(driverClass.toString());
			String jdbcUrl=dsname+hostName+":"+portNo+"/"+databaseName;
			Connection conn=DriverManager.getConnection(jdbcUrl, userName, Password);
			Statement stmt=conn.createStatement();
			rs=stmt.executeQuery(sqlQuery);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Datasource_Name ds=new Datasource_Name();
		DriverClass dc=new DriverClass();
		Database_Model model=new Database_Model();
		Connect connect=new Connect();
		String dsname=ds.getMySQL();
		String hostName="localhost";
		int portNo=3306;
		String databaseName="test";
		String driverClassName=dc.getMySQL();
		model.setUserName("akshay");
		model.setPassword("Akshay@123");
		String sql="SELECT * FROM test.department;";
//		String jdbcUrl="\""+dsname.toString()+hostName+":"+portNo+"/"+databaseName+"\"";
		ResultSet rs=connect.ConnectWithoutProperties(dsname, driverClassName, hostName, portNo, databaseName, model.getUserName(), model.getPassword(), sql);
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int count = rsMetaData.getColumnCount();
		while(rs.next())
		{
			for(int i = 1; i<=count; i++) {
		         System.out.print(rs.getObject(i)+" ");
		      }
			System.out.println();
		}
//		System.out.println(jdbcUrl);
	}

}
