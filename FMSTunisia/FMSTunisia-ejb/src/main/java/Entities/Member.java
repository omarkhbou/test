package Entities;

import Entities.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity

public class Member extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}
   
}
