/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Property_Type;
import Model.dbconnection;


import java.sql.PreparedStatement;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class p_type {
    
     private int id;
    private String name;
    private String description;
    
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer ID)
    {
        this.id=ID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String NAME)
    {
        this.name=NAME;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String DESCRIPTION)
    {
        this.description=DESCRIPTION;
    }
    
    public p_type(){}
    
    public p_type(Integer ID,String NAME,String DESCRIPTION)
    {
        this.id=ID;
        this.name=NAME;
        this.description=DESCRIPTION;
    }
    
     public boolean execTypeQuery (String querytype,p_type type)
    {
        PreparedStatement ps;
        
        if(querytype.equals("add"))
        {
            try {
                ps = dbconnection.getConnection().prepareStatement("INSERT INTO `property_type`(`name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                return(ps.executeUpdate()>0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else if(querytype.equals("edit"))
        {
            try {
                ps = dbconnection.getConnection().prepareStatement("UPDATE `property_type` SET `name`=?,`description`=? WHERE `id`=?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                return(ps.executeUpdate()>0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
         else if(querytype.equals("delete"))
        {
            try {
                ps = dbconnection.getConnection().prepareStatement("DELETE FROM `property_type` WHERE `id`=?");
                
                ps.setInt(1, type.getId());
                
                return(ps.executeUpdate()>0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Property_Type.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
         else 
         {
             JOptionPane.showMessageDialog(null,"ENTER THE CORRECT QUERY(ADD,UPDATE,DELETE)","INVALID OPERATION",2);
             return false;
         }
        
    }
     
     public HashMap<String,Integer> getTypesMap()
     {
         HashMap<String,Integer> map = new HashMap<>();
         
         Statement st;
         ResultSet rs;
         
         try {
             
             st= dbconnection.getConnection().createStatement();
             rs=st.executeQuery("SELECT * FROM `property_type`");
             
             p_type type;
             
             while(rs.next())
             {
                 type = new p_type(rs.getInt(1),rs.getString(2),rs.getString(3));
                 
                 map.put(type.getName(), type.getId());
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return map;
     }
     
     
     public p_type getTypeById(Integer id)
     {
         PreparedStatement ps;
         ResultSet rs;
         
         p_type type =new p_type();
         
         try {
             
             ps= dbconnection.getConnection().prepareStatement("SELECT * FROM `property_type` WHERE `id`=?");
             ps.setInt(1, id);
             rs=ps.executeQuery();
              
             if(rs.next())
             {
                 type.setId(id);
                 type.setName(rs.getString(2));
                 type.setDescription(rs.getString(3));
             }
             
             
         }
         catch(SQLException ex)
                 {
                    Logger.getLogger(p_type.class.getName()).log(Level.SEVERE, null, ex);

                 }
         
         return type;
     }
   
}
