/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.*;
import Model.dbconnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class p_owner {
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String address;
    
    
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int ID)
    {
        this.id=ID;
    }
    
    public String getFname()
    {
        return this.firstname;
    }
    
    public void setFname(String FNAME)
    {
        this.firstname=FNAME;
    }
    
     public String getLname()
    {
        return this.lastname;
    }
    
    public void setLname(String LNAME)
    {
        this.lastname=LNAME;
    }
    
     public String getPhone()
    {
        return this.phone;
    }
    
    public void setPhone(String PHONE)
    {
        this.phone=PHONE;
    }
    
     public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String EMAIL)
    {
        this.email=EMAIL;
    }
    
       public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String ADDRESS)
    {
        this.address=ADDRESS;
    }
    
    public boolean addNewOwner(p_owner owner)
    {
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `property_owner`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(addQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public p_owner(){}
    
    public p_owner(int ID,String FNAME,String LNAME, String PHONE,String EMAIL,String ADDRESS)
    {
        this.id=ID;
        this.firstname=FNAME;
        this.lastname=LNAME;
        this.phone=PHONE;
        this.email=EMAIL;
        this.address=ADDRESS;
    }
    
    public boolean editOwnerData(p_owner owner)
    {
         PreparedStatement ps;
        
        String editQuery = "UPDATE `property_owner` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(editQuery);
            ps.setString(1, owner.getFname());
            ps.setString(2, owner.getLname());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return true;
    }
    
    public boolean deleteOwner(int ownerId)
        {
             PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property_owner` WHERE `id`=?";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, ownerId);
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
    
    
    public ArrayList<p_owner> ownerList()
    {   
        ArrayList<p_owner> list=new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `property_owner`";
        
        try {
            st=dbconnection.getConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            p_owner owner;
            
            while(rs.next())
            {
                owner = new p_owner(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6));
                
                list.add(owner);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(p_owner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return list;
    }
        
    
    }


    




