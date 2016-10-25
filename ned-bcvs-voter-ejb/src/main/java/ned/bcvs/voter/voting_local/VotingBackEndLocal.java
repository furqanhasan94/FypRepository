/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.voter.voting_local;

import java.util.List;
import javax.ejb.Local;
import ned.bcvs.voter.dao.CandidateDao;
import ned.bcvs.voter.dao.VoterDao;

/**
 *
 * @author StackHouse
 */
@Local
public interface VotingBackEndLocal {

    String castVoteBackEnd(String voterId, String candidateId);
    
    List<CandidateDao> getCandidateList(int constituencyId);
    VoterDao getVoter(String bioMetrics);
    String getConstituencyName(int constId);
}
