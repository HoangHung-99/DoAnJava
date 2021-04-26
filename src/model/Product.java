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
public class Product {

    private Integer ID;
    private String Name;
    private Double Price;
    private Integer CategoryID;
    private Integer Quantity;

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Product(Integer id, String Name, Double Price, Integer CategoryID, Integer Quantity) {
        this.ID = id;
        this.Name = Name;
        this.Price = Price;
        this.CategoryID = CategoryID;
        this.Quantity = Quantity;
    }

    public Product(String Name, Double Price, Integer CategoryID, Integer Quantity) {
        this.Name = Name;
        this.Price = Price;
        this.CategoryID = CategoryID;
        this.Quantity = Quantity;
    }

    public Product() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(Integer CategoryID) {
        this.CategoryID = CategoryID;
    }

    public static boolean addNewProduct(Product product) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "INSERT INTO product(Name, Price, CategoryID, Quantity) VALUES ('" + product.getName() + "'," + product.getPrice() + ", " + product.getCategoryID() + "," + product.getQuantity() + ")";
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

    public static int updateNewProduct(Product product) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "UPDATE product SET Price=" + product.getPrice() + ", CategoryID=" + product.getCategoryID() + ", Name='" + product.getName() + "', Quantity=" + product.getQuantity() + " WHERE ID=" + product.getID();
            System.out.println(stament);
            int rs = stmt.executeUpdate(stament);

            conn.close();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;

    }

    public static boolean deleteProduct(Integer id) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "DELETE FROM product WHERE ID='" + id + "'";
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

    public static ArrayList<Product> getProducts() {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            // show data
            ArrayList<Product> array = new ArrayList<Product>();
            while (rs.next()) {

                Product product = new Product();
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                product.setCategoryID(rs.getInt(4));
                product.setQuantity(rs.getInt(5));
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

    public static ArrayList<Product> getProductbyCateID(Integer id) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product WHERE CategoryID=" + id + " and Quantity>0");
            // show data
            ArrayList<Product> array = new ArrayList<Product>();
            while (rs.next()) {

                Product product = new Product();
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                product.setCategoryID(rs.getInt(4));
                product.setQuantity(rs.getInt(5));

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

    public static ArrayList<Product> getSearchProduct(String data) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "select * from product WHERE ID LIKE '%" + data + "%'  or Name LIKE '%" + data + "%'  or Price LIKE '%" + data + "%'  or Quantity LIKE '%" + data + "%' or CategoryID LIKE '%" + data + "%' ";
            System.out.println(stament);
            ResultSet rs = stmt.executeQuery(stament);
            // show data
            ArrayList<Product> array = new ArrayList<Product>();
            while (rs.next()) {

                Product product = new Product();
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                product.setCategoryID(rs.getInt(4));
                product.setQuantity(rs.getInt(5));

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

    public static ArrayList<Product> checkProductExists(String name) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product where Name='" + name + "'");
            // show data
            ArrayList<Product> array = new ArrayList<Product>();
            while (rs.next()) {

                Product product = new Product();
                product.setName(rs.getString(2));
                product.setPrice(rs.getDouble(3));
                product.setCategoryID(rs.getInt(4));
                product.setQuantity(rs.getInt(5));
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
