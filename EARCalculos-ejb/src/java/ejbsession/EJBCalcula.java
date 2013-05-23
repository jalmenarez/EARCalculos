package ejbsession;

import javax.ejb.Stateless;

@Stateless
public class EJBCalcula implements EJBCalculaRemota {

    @Override
    public int suma(int n1, int n2) {
        return n1 + n2;
    }

}
