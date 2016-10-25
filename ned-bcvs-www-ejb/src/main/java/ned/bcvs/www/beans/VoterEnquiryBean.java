/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.www.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.inject.Inject;
import ned.bcvs.www.beans_local_interface.VoterEnquiryLocal;
import ned.bcvs.www.cdi.qualifier.jdbcfypdb;
import ned.bcvs.www.dao.VoterDao;

/**
 *
 * @author StackHouse
 */
@Stateful
@Local( VoterEnquiryLocal.class)
public class VoterEnquiryBean implements VoterEnquiryLocal {
    
    @Inject
    @jdbcfypdb
    private Connection con;
    
    private PreparedStatement ps ;
    private ResultSet rs ; 
    
    @Override
    public VoterDao voterEnquiry(String id){
        
        VoterDao vDao = null ;
        try {
            String querry = "select * from voter where voterId = " + id ;
            ps = con.prepareStatement(querry);
            rs = ps.executeQuery();
            while (rs.next()) {                
                vDao = new VoterDao(
                        rs.getString("VoterHash"),
                        rs.getString("VoterId"),
                        rs.getString("VoterFirstName"),
                        rs.getString("VoterLastName"),
                        rs.getInt("VoterContactNumber"),
                        rs.getInt("ConstituencyID"),
                        rs.getString("VoterBiometrics"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoterEnquiryBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vDao ;
    }
}
