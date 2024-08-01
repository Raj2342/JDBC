//package crudOPERATION;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Scanner;
//
//import in.JDBCUtil.JDBCUtil;
//
//public class SelectionQuery {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Connection  con= null;
//        PreparedStatement  state= null;
//        ResultSet resultset = null;
//        Scanner scan = new Scanner(System.in);
//        
//        try {
//        con = JDBCUtil.getjdbcConnection();
//        
//        if(con != null) {
//        	// value insert into dynamically OR USER DEFINED 
//        	String mysqlQuesry = "Select*from studentinfo.student where result=? ";
//        	 state=con.prepareStatement(mysqlQuesry);
//        	
//        	 if(state != null) {
//        		System.out.println("Enter  the string which you want to get from database "); 
//        		 String  pass = scan.nextLine();
//        		 state.setString(1, pass);
//        		 
//        		resultset = state.executeQuery();
//        		
//        		if(resultset != null) {
//        			
//        			if(resultset.next()) {
//        				System.out.println("NAME\tROLLNUM\tRESULT");
//        				System.out.println(resultset.getString(1)+"\t"+resultset.getInt(2)+"\t"+resultset.getString(3)  );
//        				
//        			}
//        			
//        		}
//        		
//        		 
//        		 
//        	 }
//        	 
//        
//        		 
//        	
//        	 }
//        	
//        
//        	
//        	
//        }
//        
//        
//        
//        catch(Exception e) {
//   		 e.printStackTrace();
//   	} finally
//      {
//   		try {
//   			JDBCUtil.closeResource(con, state , resultset);
//   		} catch(Exception e) {
//   			e.printStackTrace();
//   		}
//   	  }   
//
//	}
//
//}
