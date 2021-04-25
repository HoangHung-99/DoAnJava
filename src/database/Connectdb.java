/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thinh
 */
public class Connectdb {
    public static String DB_URL = "jdbc:mysql://localhost:3306/java";
    public static String USER_NAME = "root";
    public static String PASS_WORD = "1234";
    private Connection conn;

//    public static Connection getConnection(String dbURL, String userName,
//            String password) {
//        try {
////            conn = DriverManager.getConnection(dbURL, userName, password);
//            System.out.println("connect successfully!");
//        } catch (Exception ex) {
//            System.out.println("connect failure!");
//            ex.printStackTrace();
//        }
//        return conn;
//    }
//    
    public ResultSet TruyVan(String sqlCommand)
    {
        Statement st = null;
        ResultSet rs = null;
        try {       
            st = conn.createStatement();
            rs = st.executeQuery(sqlCommand);
//            while(rs.next()){
//                System.out.println("Ma BC= "+rs.getInt(1)+", TenBC= "+ rs.getString(2));
//            }
        } catch (SQLException ex) {
            Logger.getLogger(Connectdb.class.getName()).log(Level.SEVERE,null,ex);
        } 
        return rs;
    }
    public int ThemXoaSua(String sqlCommand){
        Statement st = null;
        int d = 0;
        try {       
            st = conn.createStatement();
            d = st.executeUpdate(sqlCommand);
            
        } catch (SQLException ex) {
            Logger.getLogger(Connectdb.class.getName()).log(Level.SEVERE,null,ex);
        } 
        return d;
    }

//    public static void main(String args[]) {
//        try {
//            // connnect to database 'testdb'
//            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from login");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
//                        + "  " + rs.getString(3));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
}
