package in.JDBCUtil;
import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

// write repetative task   driver  load , driver connection , close  resouce 
public class JDBCUtil {
     
	  public static Connection  getjdbcConnection() throws Exception 
	  {
		  // input / output opertaion lecture  -- external file input
		  // to get  the properties  from the  application file  and loading the driver  with connection 
		FileInputStream FIS = new  FileInputStream("application.properties");
		// hash table sub class is properties
		Properties p = new  Properties();
		p.load(FIS);
		
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
       Connection con = DriverManager.getConnection(url, user, password);
		
       return con;
       
       
	  }
	  
	  public static void  closeResource(Connection con , PreparedStatement state , ResultSet resultset) throws SQLException {
		  
		  if( con != null) {
			  con.close();
		  }
		  if(state != null) {
			  state.close();;
		  }
		  if(resultset != null) {
			  resultset.close();
		  }
		  
	  }
}
