//package InsertQuery;
//
//import java.sql.Connection;
//import java.sql.Statement;
//
//import in.JDBCUtil.JDBCUtil;
//
//public class InsertmysqlQuery {
//
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		 Connection con = null;
//		 Statement state = null;
//	try {
//		//  connection  ko leke ayega 
//		con = JDBCUtil.getjdbcConnection();
//		
//		if(con != null) {
//			state = con.createStatement();
//			String myinsertQuery = " insert into student(name,rollnum,result) values('raj',12,'pass')";
//		int roweffected =	state.executeUpdate(myinsertQuery);
//		
//		if(roweffected == 1) {
//			System.out.println("Row inserted");
//		}
//		else
//			System.out.println("Row Not inserted");
//				
//		}
//		
//	} catch(Exception e) {
//		 e.printStackTrace();
//	} finally {
//		try {
//			JDBCUtil.closeResource(con, state);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//
//	}
//
//}
