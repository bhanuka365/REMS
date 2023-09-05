/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.dbconnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class p_sale {
    
    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public p_sale(){}
    
    public p_sale(int ID,int PROPERTY_ID,int CLIENT_ID,String FINAL_PRICE,String SELLING_DATE)
    {
        this.id=ID;
        this.propertyId=PROPERTY_ID;
        this.clientId=CLIENT_ID;
        this.finalPrice=FINAL_PRICE;
        this.sellingDate=SELLING_DATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
     public boolean addNewSale(p_sale sale)
    {
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `sale`( `property_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
             
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean editSale(p_sale sale)
    {
         PreparedStatement ps;
        
        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return true;
    }
    
    public boolean deleteSale(int saleId)
        {
             PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `property_client` WHERE `id`=?";
        
        try {
            ps =dbconnection.getConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, saleId);
            
            return (ps.executeUpdate()>0);
            
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        }
    
    public ArrayList<p_sale> salesList()
    {   
        ArrayList<p_sale> list=new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `sale`";
        
        try {
            st=dbconnection.getConnection().createStatement();
            rs=st.executeQuery(selectQuery);
            
            p_sale sales;
            
            while(rs.next())
            {
                sales = new p_sale(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5));
                                    
                
                list.add(sales);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(p_sale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return list;
    }
    
}


