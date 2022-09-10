package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MsSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection conn=null;
			String url="jdbc:sqlserver://216.55.167.90;databaseName=ABCInsurance;encrypt=false;";
			String user="cdmello";
			String pass="Changeme@123";
			conn=DriverManager.getConnection(url,user,pass);
			Statement stmt=conn.createStatement();
				String query="Select * from ABCInsurance.dbo.Customer;";
				ResultSet rs=stmt.executeQuery(query);
//				System.out.println("SCORECARD_NAME"+"\t"+"|"+"TOTAL_ROWS"+"\t"+"|"+"INVALID_ROWS"+"\t"+"|"+"VALID_PERCENTAGE");
				ResultSetMetaData rsMetaData = rs.getMetaData();
				int count = rsMetaData.getColumnCount();
				while(rs.next())
				{
//				System.out.println(rs.getString(2));
					for(int i = 1; i<=count; i++) {
				         System.out.print(rs.getObject(i)+" ");
				      }
					System.out.println();
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
