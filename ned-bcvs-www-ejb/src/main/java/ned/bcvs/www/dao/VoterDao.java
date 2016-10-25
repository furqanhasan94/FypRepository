/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.www.dao;

/**
 *
 * @author StackHouse
 */
public class VoterDao {
     
    
   private String voterhash ;
    private String voterId ;
    private String firstName ;
    private String lastName ;
    private int contactNumber ;
    private int constituencyId ;
    private String bioMetrics ;

    public VoterDao(String voterhash, String voterId, String firstName, String lastName, int contactNumber,  int constituencyId, String bioMetrics) {
        this.voterhash = voterhash;
        this.voterId = voterId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.bioMetrics = bioMetrics;
        this.constituencyId = constituencyId;
    }

        
    
    
    /**
     * @return the voterhash
     */
    public String getVoterhash() {
        return voterhash;
    }

    /**
     * @param voterhash the voterhash to set
     */
    public void setVoterhash(String voterhash) {
        this.voterhash = voterhash;
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
     * @return the contactNumber
     */
    public int getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the bioMetrics
     */
    public String getBioMetrics() {
        return bioMetrics;
    }

    /**
     * @param bioMetrics the bioMetrics to set
     */
    public void setBioMetrics(String bioMetrics) {
        this.bioMetrics = bioMetrics;
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

}
