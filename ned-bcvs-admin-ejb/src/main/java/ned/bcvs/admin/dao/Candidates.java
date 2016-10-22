/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.admin.dao;

/**
 *
 * @author StackHouse
 */
public class Candidates {
    
    private String candidateHash ;
    private String firstName ;
    private String lastName ;
    private int voterId ;
    private int constituencyId ;
    private int electionSymbolId ;
    
    public Candidates(String hash, String fname, String lname, int id, int cid, int esid){
        setCandidateHash(hash);
        setFirstName(fname);
        setLastName(lname);
        setVoterId(id);
        setConstituencyId(cid);
        setElectionSymbolId(esid);
    }

    /**
     * @return the candidateHash
     */
    public String getCandidateHash() {
        return candidateHash;
    }

    /**
     * @param candidateHash the candidateHash to set
     */
    public void setCandidateHash(String candidateHash) {
        this.candidateHash = candidateHash;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the voterId
     */
    public int getVoterId() {
        return voterId;
    }

    /**
     * @param voterId the voterId to set
     */
    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    /**
     * @return the constituencyId
     */
    public int getConstituencyId() {
        return constituencyId;
    }

    /**
     * @param constituencyId the constituencyId to set
     */
    public void setConstituencyId(int constituencyId) {
        this.constituencyId = constituencyId;
    }

    /**
     * @return the electionSymbolId
     */
    public int getElectionSymbolId() {
        return electionSymbolId;
    }

    /**
     * @param electionSymbolId the electionSymbolId to set
     */
    public void setElectionSymbolId(int electionSymbolId) {
        this.electionSymbolId = electionSymbolId;
    }
}
