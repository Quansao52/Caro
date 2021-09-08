/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

/**
 *
 * @author Lenovo
 */
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
public class UserDAO  extends  DAO{
        PreparedStatement pst;
        ResultSet rs;
        public boolean checkLogin(String uname, String pwd) {
        try {
            //System.out.println("sdnfjsdncj");
            pst = con.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
            pst.setString(1, uname); //Thay vào tham số "?" đầu tiên trogn query cho username
            pst.setString(2, pwd);    //Thay vào tham số "?" thứ hai trong query cho password
            int p=9;
            rs = pst.executeQuery();
            if (rs != null) {
                 System.out.println("login Successful");
                }
             else System.out.println("Login fail");
            if (rs.next()) {
                
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("lỗi " + e);
            e.printStackTrace();
            return false;
        }
    }
    
}
