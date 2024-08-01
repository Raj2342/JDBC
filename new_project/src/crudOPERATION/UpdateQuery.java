package crudOPERATION;
import java.sql.Connection;
import java.util.Scanner;

import java.sql.PreparedStatement;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Connection  con= null;
            PreparedStatement  state= null;
            
            try {
            con = JDBCUtil.getjdbcConnection();
            
            if(con != null) {
            	try (Scanner sc = new Scanner(System.in)) {
					// value insert into dynamically OR USER DEFINED 
					String mysqlQuesry = "update human set last_name=? where student_id=? ";
					 state=con.prepareStatement(mysqlQuesry);
					 
					 if(state != null) {
						 
						 System.out.println("enter the last_name  ");
						 String name = sc.nextLine();
						 
						 System.out.println("enter  student_id  ");
						 int id = sc.nextInt();
						 
						 
						 
						 state.setString(1, name);
						 state.setInt(2, id);
						 
						int roweffected = state.executeUpdate();
						
						if(roweffected ==1) {
							System.out.println("row inserted ");
								
						}
						else {
							System.out.println("row NOT inserted ");
						}
					 }
				}
            	
            }
            	
            	
            }
            
            
            
            catch(Exception e) {
       		 e.printStackTrace();
       	} finally
          {
       		try {
       			JDBCUtil.closeResource(con, state, null);
       		} catch(Exception e) {
       			e.printStackTrace();
       		}
       	  }   
	}

}

