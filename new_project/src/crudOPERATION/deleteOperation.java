package crudOPERATION;
import java.sql.Connection;
import java.util.Scanner;

import java.sql.PreparedStatement;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class deleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Connection  con= null;
            PreparedStatement  state= null;
            
            try {
            con = JDBCUtil.getjdbcConnection();
            
            if(con != null) {
            	try (Scanner sc = new Scanner(System.in)) {
					// value insert into dynamically OR USER DEFINED 
					String mysqlQuesry = " delete from human where student_id =? ";
					 state=con.prepareStatement(mysqlQuesry);
					 
					 if(state != null) {
						 
						 System.out.println("enter the id which you want delete  ");
						 int id = sc.nextInt();
						  
						 state.setInt(1, id);
						 
						int roweffected = state.executeUpdate();
						
						if(roweffected ==1) {
							System.out.println("row deleted ");
								
						}
						else {
							System.out.println("row NOT deleted ");
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

