package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Forum
 *
 */
@Entity

public class Forum implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idForum;
	private String forumName;
	private String description;
	private static final long serialVersionUID = 1L;

	public Forum() {
		super();
	}   
	public int getIdForum() {
		return this.idForum;
	}

	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}   
	public String getForumName() {
		return this.forumName;
	}

	public void setForumName(String forumName) {
		this.forumName = forumName;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
