/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs_www_online;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import ned.bcvs.www.beans_local_interface.VoterEnquiryLocal;
import ned.bcvs.www.dao.VoterDao;

/**
 *
 * @author StackHouse
 */
@Named
@Stateless
public class EnquiryBean {
    
    @EJB
    private VoterEnquiryLocal vEnq ;
    private String voterId ;
    private VoterDao voter ;
    
    public void voterDetails(){
        setVoter(vEnq.voterEnquiry(voterId));
    }

    
    
    /**
     * @return the voterId
     */
    public String getVoterId() {
        return voterId;
    }

    /**
     * @param voterId the voterId to set
     */
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    /**
     * @return the vDAo
     */
    public VoterDao getVoter() {
        return voter;
    }

    /**
     * @param vDAo the vDAo to set
     */
    public void setVoter(VoterDao vDAo) {
        this.voter = vDAo;
    }
}
