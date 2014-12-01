package tn.edu.esprit.gl.foot_bookEJB.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stadium
 *
 */
@Entity

public class Stadium implements Serializable {

	
	private int id;
	private String libele;
	private static final long serialVersionUID = 1L;

	public Stadium() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getLibele() {
		return this.libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
   
}
