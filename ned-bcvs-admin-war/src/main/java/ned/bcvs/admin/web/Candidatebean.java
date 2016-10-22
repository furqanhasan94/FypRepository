/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.admin.web;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import ned.bcvs.admin.bean_local_interface.AdminCandidateOperationsLocal;
import ned.bcvs.admin.dao.Candidates;

/**
 *
 * @author StackHouse
 */
@Named
@SessionScoped
@Stateful
public class Candidatebean {
    
    @EJB
    private AdminCandidateOperationsLocal candidateOps ;
    
    public List<Candidates> getCandidateList(){
        return candidateOps.getCandidateList();
    }
    
    public void candidateHashAssign(){
        candidateOps.generateCandidateHash();
    }
}
