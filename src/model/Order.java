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
public class Order {
    private Integer ID;
    private String datetime;
    private String Detail;
    private Double Total;

    public Order(Integer id,String datetime, String Detail, Double Total) {
        this.ID=id;
        this.datetime = datetime;
        this.Detail = Detail;
        this.Total = Total;
    }

    public Order() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    public static boolean addOrder(Order receipt){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "INSERT INTO Order(Date,Detail,Total) VALUES  ('"+receipt.getDatetime()+"','"+receipt.getDetail()+"', "+receipt.getTotal()+")";
               System.out.println(stament);
               boolean rs;
               rs = stmt.execute(stament);
               
               conn.close();
               return rs;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return false;
        
    }
    
    public static boolean deleteOrder(Integer id){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "DELETE FROM product WHERE ID='"+id+"'";
               System.out.println(stament);
               boolean rs;
               rs = stmt.execute(stament);
               conn.close();
               return rs;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return false;
        
    }
    
    public static ArrayList<Order> getOrder(){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("select * from Order ORDER by ID DESC");
               // show data
               ArrayList<Order> array = new ArrayList<Order>();
               while (rs.next()) {
                   
                   Order receipt = new Order(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
                   array.add(receipt);
               }
               // close connection
               
               conn.close();
               return array;
           } catch (Exception ex) {
               ex.printStackTrace();
           }
        return null;
    }
    
    public static ArrayList<Order> getSearchOrder(String data){
        try {
               Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
               Statement stmt = conn.createStatement();
               String stament = "select * from receipt WHERE ID LIKE '%"+data+"%'  or Date LIKE '%"+data+"%'  or Detail LIKE '%"+data+"%' or Total LIKE '%"+data+"%' ";
               System.out.println(stament);
               ResultSet rs = stmt.executeQuery(stament);
               // show data
               ArrayList<Order> array = new ArrayList<Order>();
               while (rs.next()) {
                   
                   Order product = new Order(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
                   
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
