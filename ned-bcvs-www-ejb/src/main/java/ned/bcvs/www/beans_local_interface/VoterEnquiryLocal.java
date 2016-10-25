/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.www.beans_local_interface;

import javax.ejb.Local;
import ned.bcvs.www.dao.VoterDao;

/**
 *
 * @author StackHouse
 */
@Local
public interface VoterEnquiryLocal {

    VoterDao voterEnquiry(String id);
    
}
