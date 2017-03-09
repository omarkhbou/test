package Entities;

import Entities.User;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Moderator
 *
 */
@Entity

public class Moderator extends User implements Serializable {

	
	private int idForumManaged;
	private static final long serialVersionUID = 1L;

	public Moderator() {
		super();
	}   
	public int getIdForumManaged() {
		return this.idForumManaged;
	}

	public void setIdForumManaged(int idForumManaged) {
		this.idForumManaged = idForumManaged;
	}
   
}
