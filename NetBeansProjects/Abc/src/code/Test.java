/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSetMetaData;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Test{
	static final String DATABASE_URL = "jdbc:mysql://localhost/farm";
	static final String DB_USERNAME = "root";
	static final String DB_PASSWORD = "";
	public static void main(String[] args) {
		

		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		
		System.out.println("Press 1 For Read."+'\n' +"Press 2 For Insert. ");

        Scanner input = new Scanner(System.in); 
        int a = input.nextInt();
        
        if(a==1) {
        	System.out.println("Data showed from CROPS");
		
			try {
				connection = (Connection) DriverManager.getConnection(DATABASE_URL, DB_USERNAME, DB_PASSWORD);
				statement = (Statement) connection.createStatement();
				resultset = statement.executeQuery("SELECT * FROM crops") ;
				ResultSetMetaData metaData = resultset.getMetaData();
				
				int numberOFColums = metaData.getColumnCount();
				
				int number = 1;
				while(resultset.next()) {
					System.out.println('\n');
					
					
					for(int i=1; i<=numberOFColums;i++)
						System.out.print(resultset.getObject(i) + " ");
					number++;
				}
			}
			
			catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			
			finally {
				try {
					resultset.close();
					statement.close();
					connection.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		}
		
		else {                                                             // for insert
			Scanner input1 = new Scanner(System.in); 
			String crops_name = input1.nextLine();
			System.out.println(crops_name);
			
			
			try {
				connection = (Connection) DriverManager.getConnection(DATABASE_URL, DB_USERNAME, DB_PASSWORD);
				statement = (Statement) connection.createStatement();
				
				String sql = "INSERT INTO `crops`(Name) VALUE ('"+crops_name+"')" ;
				statement.executeUpdate(sql);
				
			    System.out.println("Inserted records into the table CROPS");
			}
			
			catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			
			finally {
				try {
					//resultset.close();
					statement.close();
					connection.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

    



