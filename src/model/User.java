/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import static database.Connectdb.DB_URL;
import static database.Connectdb.PASS_WORD;
import static database.Connectdb.USER_NAME;
import static java.sql.DriverManager.getConnection;
import java.util.ArrayList;

/**
 *
 * @author Thinh
 */
public class User {

    private Integer UserID;
    private String Name;
    private String Username;
    private String Password;
    private Integer Level;
    private String Phone;
    private String Email;
    private String Sex;

    public User(Integer id, String username, String Password, String name, Integer lv,String phone,String email,String sex) {
        this.UserID = id;
        this.Username = username;
        this.Password = Password;
        this.Name = name;
        this.Level = lv;
        this.Phone = phone;
        this.Email = email;
        this.Sex = sex;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public User() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    public static boolean addUser(User user) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "INSERT INTO login(Username, Password, Name, Level) VALUES ('" + user.getUsername() + "', '" + user.getPassword() + "', '" + user.getName() + "', " + user.getLevel() + ")";
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

    public static int updateUser(User user) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "UPDATE login SET Username='" + user.getUsername() + "', Password='" + user.getPassword() + "',Name='" + user.getName() + "',Level=" + user.getLevel() + " WHERE ID=" + user.getUserID() + "";
            System.out.println(stament);
            int rs = stmt.executeUpdate(stament);

            conn.close();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }

    }

    public static boolean deleteUser(User user) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "DELETE FROM login WHERE ID=" + user.getUserID() + "";
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

    public static User checkLogin(String username, String password) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "select * from login where Username='" + username + "'";
            System.out.println(stament);
            ResultSet rs = stmt.executeQuery(stament);
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getInt(5));
                if (rs.getString(3).toLowerCase().equals(password)) {
                    User user = new User();
                    user.setUserID(rs.getInt(1));
                    user.setUsername(rs.getString(2));
                    user.setPassword(rs.getString(3));
                    user.setName(rs.getString(4));
                    user.setLevel(rs.getInt(5));
                    return user;
                } else {
                    return null;
                }
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static ArrayList<User> getEmployee(User logined) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "select * from login where ID!=" + logined.getUserID() + " and Level>" + logined.getLevel();
            System.out.println(stament);
            ResultSet rs = stmt.executeQuery(stament);
            // show data

            ArrayList<User> array = new ArrayList<User>();
            while (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setLevel(rs.getInt(5));
                array.add(user);

            }
            // close connection
            conn.close();
            return array;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static Integer getUserIDbyName(String userName) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "select ID from login where Username='" + userName + "'";
            System.out.println(stament);
            ResultSet rs = stmt.executeQuery(stament);
            // show data
            Integer ID = 0;
            while (rs.next()) {
                System.out.println(rs.getInt(1));

                ID = rs.getInt(1);
            }

            conn.close();
            return ID;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static ArrayList<User> getSearchUser(String data) {
//        try {
//            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
//            Statement stmt = conn.createStatement();
//            String stament = "select * from login WHERE Name LIKE '%" + data + "%'  or Username LIKE '%" + data + "%'  or Level LIKE '%" + data + "%' ";
//            System.out.println(stament);
//            ResultSet rs = stmt.executeQuery(stament);
//            // show data
//            ArrayList<User> array = new ArrayList<User>();
//            while (rs.next()) {
//
//                User product = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
//
//                array.add(product);
//            }
//            // close connection
//
//            conn.close();
//            return array;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }

    public static ArrayList<User> checkEmployeeExist(String name) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASS_WORD);
            Statement stmt = conn.createStatement();
            String stament = "select * from login where Username='" + name + "'";
            System.out.println(stament);
            ResultSet rs = stmt.executeQuery(stament);
            // show data

            ArrayList<User> array = new ArrayList<User>();
            while (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setLevel(rs.getInt(5));
                array.add(user);

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
