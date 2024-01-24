package WelathManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowExpense 
{
	static Connection connection = JDBCConnect.getConnection();
    ResultSet rs = null;
	public void showExpenses(String userEmail) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM employee.Expenses WHERE Email=?;";
        //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        //connection = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,userEmail);
        rs  = ps.executeQuery();
        while(rs.next()){
            int expId = rs.getInt("expId");
            Date expDate = rs.getDate("expDate");
            String expDesc = rs.getString("expdesc");
            String catId = rs.getString("catId");
            String usrEmail = rs.getString("Email");
            System.out.println(expId+"\t\t"+expDate+"\t\t"+expDesc+"\t\t\t"+catId+"\t\t\t"+usrEmail);
        }

    }

}
