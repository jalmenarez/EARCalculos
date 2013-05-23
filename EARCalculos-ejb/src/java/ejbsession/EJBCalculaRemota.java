package ejbsession;

import javax.ejb.Remote;

@Remote
public interface EJBCalculaRemota {
    public int suma(int n1,int n2);
}
