package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class PersonServicesEJB
 */
@Stateless
@LocalBean
public class PersonServicesEJB implements PersonServicesEJBRemote, PersonServicesEJBLocal {

    /**
     * Default constructor. 
     */
    public PersonServicesEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void afficherNom(String name) {

		System.out.println(name);
	}

}
