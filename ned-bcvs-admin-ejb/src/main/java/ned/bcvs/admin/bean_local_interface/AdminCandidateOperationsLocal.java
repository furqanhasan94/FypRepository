/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.admin.bean_local_interface;

import java.util.List;
import javax.ejb.Local;
import ned.bcvs.admin.dao.Candidates;

/**
 *
 * @author StackHouse
 */
@Local
public interface AdminCandidateOperationsLocal {
    
    List<Candidates> getCandidateList(); 
    void generateCandidateHash();
}
