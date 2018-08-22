/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sudarsan
 */
public class DbOperation {

    public void saveCustomer(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "insert into \"Customer\"(first_name,last_name,gender,address,phone_number,email,category) values (?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setLong(5, Long.parseLong(dataToSave.get(4).toString()));
            ps.setString(6, dataToSave.get(5).toString());
            ps.setString(7, dataToSave.get(6).toString());

            ps.executeUpdate();

            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public ArrayList viewById(String id){
        String SQL;        
        ArrayList data = new ArrayList();
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select id,first_name,last_name,gender,address,phone_number,email,category from \"Customer\" where id=?;";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data.add(rs.getString("first_name"));
                data.add(rs.getString("last_name"));
                data.add(rs.getString("gender"));
                data.add(rs.getString("address"));
                data.add(rs.getString("phone_number"));
                data.add(rs.getString("email"));
                data.add(rs.getString("category"));
                data.add(id);
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
    }
    public ResultSet viewCustomerTable() {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select id,first_name,last_name,gender,address,phone_number,email,category from \"Customer\" order by id asc";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }
public ResultSet viewAtmTable(){
            String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select Address,number_of_atm from \"ATM\";";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
}
public ArrayList getAddressCustomer(){
            String SQL;        
        ArrayList data = new ArrayList();
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select address from \"Customer\";";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                data.add(rs.getString("address"));
                
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
}
public ArrayList getAddressATM(){
            String SQL;        
        ArrayList data = new ArrayList();
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select address from \"ATM\";";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               
                data.add(rs.getString("address"));
                
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
//                String query;
//                            ArrayList data=null;
//
//        ResultSet rs = null;
//        try {
//            DB_Connect dc = new DB_Connect();
//            dc.connectDatabase();
//            Statement s = dc.conn.createStatement();
//            query = "select Address from \"ATM\";";
//            rs = s.executeQuery(query);
//            while(rs.next()){
//                data.add(rs.getString("address"));
//            }
//            dc.closeDBConnection();
//
//        } catch (SQLException ex) {
//            System.out.println("cant create statement" + ex);
//        }
//        return data;
}
public void addAtmToNewLocation(ArrayList dataToSave){
            DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "insert into \"ATM\"(address,Number_of_atm) values (?,?);";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setInt(2, Integer.parseInt(dataToSave.get(1).toString()));

            ps.executeUpdate();

            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public String getNumberOfCustomer(String cat,String address){
                String SQL = "SELECT count(id) FROM \"Customer\" where category=? and address=?;";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String num=null;
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, cat);
            ps.setString(2, address);
           ResultSet rs= ps.executeQuery();
           dc.closeDBConnection();
           while(rs.next())
               num=rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return num;
}
public void modifyNumberOfAtm(String address,String num){
            DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "UPDATE \"ATM\" set Number_of_atm=? WHERE address=?;";
        try {          
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(2, address);
            ps.setInt(1, Integer.parseInt(num));
            
            ps.executeUpdate();
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void deleteAllAtm(String address){
            String SQL = "DELETE FROM \"ATM\" WHERE address=?;";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, address);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public ResultSet viewFromCustomerTable(String fn, String ln) {

        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            query = "select id,first_name,last_name,gender,address,phone_number,email,category from \"Customer\" where first_name ilike ?"
                    + "and last_name ilike ?";

            PreparedStatement ps = dc.conn.prepareStatement(query);
            ps.setString(1, fn + "%");
            ps.setString(2, ln + "%");
            rs = ps.executeQuery();
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public void deleteCustomer(String id) {
        String SQL = "DELETE FROM \"Customer\" WHERE id=?;";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCustomer(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "UPDATE \"Customer\" set first_name=?, last_name=?, gender=?, address=?,"
                + "phone_number=?, email=?, category=? WHERE id=?;";
        try {          
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setLong(5, Long.parseLong(dataToSave.get(4).toString()));
            ps.setString(6, dataToSave.get(5).toString());
            ps.setString(7, dataToSave.get(6).toString());
            ps.setInt(8, Integer.parseInt(dataToSave.get(7).toString()));
            ps.executeUpdate();
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
