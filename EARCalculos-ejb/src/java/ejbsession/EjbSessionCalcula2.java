package ejbsession;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class EjbSessionCalcula2 {

    public int suma2(int n1, int n2){
        return n1 + n2;
    }

}
