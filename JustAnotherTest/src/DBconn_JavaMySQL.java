import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBconn_JavaMySQL {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBconn_JavaMySQL(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aps_datamodel", "root", "root");
			st = con.createStatement();
			
		}
		catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	
	public void getData()
	{
		/*
		 * Procedimiento para obtener los resgistros de la tabla Locations en la BD 
		 */
		try{
			String query = "select * from location";
			rs = st.executeQuery(query);
			
			System.out.println("Records from DataBase");
			while(rs.next()){
				String locID = rs.getString("id");
				String locName = rs.getString("name");
				System.out.println("ID: "+locID+" \t Name: "+locName+" ");
			}
			
			
		}
		catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}

}
