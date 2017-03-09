package services;

import javax.ejb.Remote;

@Remote
public interface PersonServicesEJBRemote {
public void afficherNom(String name);
}
