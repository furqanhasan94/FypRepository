/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ned.bcvs.admin;

import javax.ejb.Local;

/**
 *
 * @author StackHouse
 */
@Local
public interface AdminLoginValidatorLocal {

    boolean validateCredentials(String un, String pwd);
    
}
