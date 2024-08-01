package crudOPERATION;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import in.JDBCUtil.JDBCUtil;

public class prepared_Statement_Insertsql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Connection  con= null;
            PreparedStatement  state= null;
            
            try {
            con = JDBCUtil.getjdbcConnection();
            
            if(con != null) {
            	// value insert into dynamically OR USER DEFINED 
            	String mysqlQuesry = " insert into human(student_id,last_name,first_name,major,birth_date) values(?,?,?,?,?)";
            	 state=con.prepareStatement(mysqlQuesry);
            	 
            	 if(state != null) {
            		 state.setInt(1, 2);
            		 state.setString(2, "rana");
            		 state.setString(3, "bappa");
            		 state.setString(4, "math"); 
            		 state.setDate(5, Date.valueOf("1700-05-05"));
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
            
            
            
            catch(Exception e) {
       		 e.printStackTrace();
       	} finally
          {
       		try {
       			JDBCUtil.closeResource(con, state , null);
       		} catch(Exception e) {
       			e.printStackTrace();
       		}
       	  }   
	}

}
