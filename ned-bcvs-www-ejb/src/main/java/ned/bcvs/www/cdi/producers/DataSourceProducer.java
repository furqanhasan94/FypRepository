/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.www.cdi.producers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import ned.bcvs.www.cdi.qualifier.jdbcfypdb;

/**
 *
 * @author StackHouse
 */
public class DataSourceProducer {
    
    
    @Produces
    @jdbcfypdb
    @RequestScoped
    private Connection dbConnector(){
        Connection c = null ;
        try {
            DataSource ds = (DataSource)new InitialContext().lookup("jdbc/fypdb");
            c = ds.getConnection();
            System.out.println("***!!!!@@@@ Successfully connected to data base @@@@@@@********!!!!!");
        } catch (Exception e) {
        }
        return c ;
    }
    
    private void dbConnectionCloser(@Disposes Connection con){
        try {
            con.close();
            System.out.println("***!!!!@@@@ Connection with data base closed@@@@@@@********!!!!!");
        } catch (SQLException ex) {
            Logger.getLogger(DataSourceProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
