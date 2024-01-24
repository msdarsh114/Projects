package WelathManagement;

import java.util.Scanner;
import java.sql.*;
public class main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
    {
        Boolean flag = false;
        do {
            System.out.println("-------------------WELCOME TO WEALTH MANAGEMENT SYSTEM------------------");
            int choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Choice: \n 1. Registration \n 2. Login\n 3. Enter Category \n 4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Registration rg = new Registration();
                    System.out.print("Enter your email: ");
                    String email = sc.next();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    System.out.print("Enter your first name: ");
                    String firstName = sc.next();

                    System.out.print("Enter your last name: ");
                    String lastName = sc.next();
                    System.out.println(rg.Register(email, pass, firstName, lastName));
                }
                break;
                case 2: {
                    login lg = new login();
                    //lg.Login();
                    System.out.print("Enter your email: ");
                    String email = sc.next();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    if (lg.Login(email, pass)) {
                        System.out.println("Login Successful");
                        flag = true;
                        System.out.println("Category Id\t\tCategory Name");
                        Category ctg = new Category();                     
                        ctg.showCategory();
                        System.out.print("Do you want to Make new Expense? (Yes/No)");
                        String resp = sc.next();
                        if(resp.equals("Yes")){
                            System.out.print("Select Category Id");
                            int selcatId = sc.nextInt();
                            Expense exp = new Expense();
                            ShowExpense exp1=new ShowExpense();
                            System.out.println(exp.insertExpenseDetails(email, selcatId));
                            System.out.println("Expenses Inserted and Your Expenses are: ");
                            System.out.println("Expense ID"+"\t"+"Expense Date"+"\t\t"+"Expense Desc"+"\t\t"+"Category ID"+"\t\t"+"Email");
                            exp1.showExpenses(email);
                        }
                        else{
                            ShowExpense exp2 = new ShowExpense();
                            System.out.println("Expense ID"+"\t"+"Expense Date"+"\t\t"+"Expense Desc"+"\t\t"+"Category ID"+"\t\t"+"Email");
                            exp2.showExpenses(email);
                            System.out.println("You exited.");

                       }
                    } else {
                        System.out.println("Login Failed");
                    }
                }
                break;
                case 3:{
                    if(flag){
                        System.out.println("-------------Category-------------");
                        System.out.println("Enter Category Id: ");
                        int categoryId = sc.nextInt();
                        System.out.println("Enter Category Name: ");
                        String categoryName = sc.next();
                        Category catg = new Category();
                        System.out.println(catg.insertCategory(categoryId, categoryName));
                    }
                    else{
                        System.out.println("Try to Login First!!!");
                    }
                }
                break;
                case 4:{
                    return;
                }
                default: {
                    System.out.println("Please check the input and try again!");
                }
                
            }
            
            System.out.println("-------------------Thank you for Visiting Wealth Management------------------");
            
        }while(true);
        
    }
}
