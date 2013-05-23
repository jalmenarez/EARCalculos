/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbsession;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author java
 */
@Stateless
@LocalBean
public class EJBValida {

    public boolean validaLogin(String usuario, String password) {
        return usuario.equalsIgnoreCase("alfa") && password.equals("alfa");
    }

}
