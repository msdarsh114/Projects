package WelathManagement;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Expense {
        static Connection connection = JDBCConnect.getConnection();
        ResultSet resultSets = null;
        String str = "";
        public String insertExpenseDetails(String email, int categoryid) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
            try{
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter Expense Id ");
                int expId = scanner.nextInt();

                System.out.print("Enter Expense Date ");
                String expDate = scanner.next();
                LocalDate d = LocalDate.parse(expDate);

                System.out.print("Enter Expense Description: ");
                String expDes = scanner.next();

                String sql = "INSERT INTO employee.expenses(expId,expDate, expdesc, categoryid, email) VALUES (?,?,?,?,?);";
                //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                //connection = DriverManager.getConnection(url, username, password);
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1,expId);
                ps.setString(2,expDate);
                ps.setString(3,expDes);
                ps.setInt(4,categoryid);
                ps.setString(5,email);


                int status = ps.executeUpdate();
                if(status!=0){
                    str = "Expenses Inserted";
                }

            }
            catch (Exception e){
                str = "Error";
            }
            return str;

        }

    
}
