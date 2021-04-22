/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import static database.Connectdb.DB_URL;
import static database.Connectdb.PASS_WORD;
import static database.Connectdb.USER_NAME;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Thinh
 */
public class Category {
    private Integer CateID=0;
    private String Name = "";

    public Integer getCateID() {
        return CateID;
    }

    public void setCateID(Integer CateID) {
        this.CateID = CateID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

    public Category() {
    }
    public Category(Integer id,String name) {
        this.CateID = id;
        this.Name = name;
    }
    
    public static boolean addNewCategory(Category category){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "INSERT INTO Category(Name) VALUES ('"+category.getName()+"')";
               System.out.println(stament);
               boolean rs;
               rs = stmt.execute(stament);
               
               conn.close();
               return rs;
           } catch (Exception ex) {
               ex.printStackTrace();
               return false;
           }
        
        
    }
    
    public static int updateCategory(String name, Integer id){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "UPDATE Category SET Name='"+name+"' WHERE ID="+id+"";
               System.out.println(stament);
               int rs = stmt.executeUpdate(stament);
               
               conn.close();
               return rs;
           } catch (Exception ex) {
               ex.printStackTrace();
               return 0;
           }
        
        
    }
    
    public static boolean deleteCategory(Integer id){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "DELETE FROM Category WHERE ID="+id+"";
               System.out.println(stament);
               boolean rs;
               rs = stmt.execute(stament);
               conn.close();
               return rs;
           } catch (Exception ex) {
               
               ex.printStackTrace();
               return false;
           }
        
    }
    
    public static boolean deleteProductbyCateID(Integer id){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "DELETE FROM product WHERE CategoryID="+id+"";
               System.out.println(stament);
               boolean rs;
               rs = stmt.execute(stament);
               conn.close();
               return rs;
           } catch (Exception ex) {
               ex.printStackTrace();
               return false;
           }
        
        
    }
    
    
    public static ArrayList<Category> getCategory(){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("select * from Category");
               // show data
               ArrayList<Category> array = new ArrayList<Category>();
               while (rs.next()) {
                   Category category = new Category();
                   category.setCateID(rs.getInt(1));
                   category.setName(rs.getString(2));
                   array.add(category);
               }
              
               conn.close();
               return array;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
    
    
    public static Integer getCategoryID(String categoryName){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "select * from Category where Name='"+categoryName+"'";
               System.out.println(stament);
               ResultSet rs = stmt.executeQuery(stament);
               // show data
               Integer ID=0;
               while (rs.next()) {
                   ID = rs.getInt(1);
               }
               
               conn.close();
               return ID;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
    
    public static String getCategoryName(Integer id){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "select * from Category where ID='"+id+"'";
               System.out.println(stament);
               ResultSet rs = stmt.executeQuery(stament);
               // show data
               String ID="";
               while (rs.next()) {
                   ID = rs.getString(2);
               }
               
               conn.close();
               return ID;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
    
    public static ArrayList<Category> getSearchCategory(String data){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "select * from Category WHERE ID LIKE '%"+data+"%'  or Name LIKE '%"+data+"%' ";
               System.out.println(stament);
               ResultSet rs = stmt.executeQuery(stament);
               // show data
               ArrayList<Category> array = new ArrayList<Category>();
               while (rs.next()) {
                   
                   Category product = new Category();
                   product.setName(rs.getString(2));
                   product.setCateID(rs.getInt(1));
                   
                   array.add(product);
               }
               // close connection
               
               conn.close();
               return array;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
    
    public static ArrayList<Category> checkCategoryExists(String name){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("select * from Category where Name='"+name+"'");
               // show data
               ArrayList<Category> array = new ArrayList<Category>();
               while (rs.next()) {
                   
                   Category product = new Category();
                   product.setName(rs.getString(2));
                   product.setCateID(rs.getInt(1));
                   array.add(product);
               }
               // close connection
               
               conn.close();
               return array;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
}
